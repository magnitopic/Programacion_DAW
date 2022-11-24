package StarWars;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Jedi[] jedis = new Jedi[5];
		Padawan[] padawans = new Padawan[5];
		int opt, potencial;

		// pedir datos
		for (int i = 0; i < padawans.length; i++) {
			String name, planet;
			int age, strength;
			System.out.print("Introduce el nombre del Padawan: ");
			name = sc.nextLine();
			System.out.print("Introduce la edad del Padawan: ");
			age = sn.nextInt();
			System.out.print("Introduce la fuerza del Padawan: ");
			strength = sn.nextInt();
			System.out.print("Introduce el protencial del Padawan: ");
			potencial = sn.nextInt();
			System.out.print("Introduce el planeta de origen del Padawan: ");
			planet = sc.nextLine();
			padawans[i] = new Padawan(name, age, strength, potencial, planet);
		}

		for (int i = 0; i < jedis.length; i++) {
			String name, planet, laser;
			int age, strength;
			System.out.print("Introduce el nombre del Jedi: ");
			name = sc.nextLine();
			System.out.print("Introduce la edad del Jedi: ");
			age = sn.nextInt();
			System.out.print("Introduce la fuerza del Jedi: ");
			strength = sn.nextInt();
			System.out.print("Introduce el planeta de origen del Jedi: ");
			planet = sc.nextLine();
			System.out.print("Introduce el color de la espada laser del Jedi: ");
			laser = sc.nextLine();
			jedis[i] = new Jedi(name, age, strength, planet, laser);
		}

		while (true) {
			showMenu();
			opt = sn.nextInt();
			switch (opt) {
				case 1:
					mostrarDatosJedi(jedis);
					break;
				case 2:
					mostrarDatosPadas(padawans);
					break;
				case 3:
					dameJedixnombre(jedis, sn).mostrarDatos();
					break;
				case 4:
					damePadixnombre(padawans, sn).mostrarDatos();
					break;
				case 5:
					System.out.print("Intoduce el nivel de potencial con el que quieres filtrar: ");
					potencial = sc.nextInt();
					Padawan[] potenciales = damePadassuppot(padawans, potencial);
					for (int i = 0; i < potenciales.length; i++) {
						potenciales[i].mostrarDatos();
					}
					break;
				case 6:
					mostrarJedis2maxfuerza(jedis);
					break;
				case 7:
					damePadaminfuerza(padawans).mostrarDatos();
					break;
				case 8:
					damePadasxletra(padawans, sn);
					break;
				case 9:
					ponerJedismayusculas(jedis);
					break;
				case 10:
					ponerPadasminus(padawans);
					break;
				case 11:
					sc.close();
					sn.close();
					return;
			}
		}

	}

	private static void mostrarDatosJedi(Jedi[] jedis) {
		for (int i = 0; i < jedis.length; i++)
			jedis[i].mostrarDatos();
	}

	private static void mostrarDatosPadas(Padawan[] padawans) {
		for (int i = 0; i < padawans.length; i++)
			padawans[i].mostrarDatos();
	}

	private static Jedi dameJedixnombre(Jedi[] jedis, Scanner sn) {
		int position = -1;
		int j = 0;
		String nameToSerch;
		System.out.print("Inroduce el nombre del Jedi que quieres buscar: ");
		nameToSerch = sn.nextLine();
		while (position == -1 && j + 1 < jedis.length) {
			if (jedis[j].getNombre().equalsIgnoreCase(nameToSerch))
				return jedis[j];
			j++;
		}
		return new Jedi();
	}

	private static Padawan damePadixnombre(Padawan[] padawans, Scanner sn) {
		int position = -1;
		int j = 0;
		String nameToSerch;
		System.out.print("Inroduce el nombre del Padawan que quieres buscar: ");
		nameToSerch = sn.nextLine();
		while (position == -1 && j + 1 < padawans.length) {
			if (padawans[j].getNombre().equalsIgnoreCase(nameToSerch))
				return padawans[j];
			j++;
		}
		return new Padawan();
	}

	private static Padawan[] damePadassuppot(Padawan[] padawans, int potencial) {
		Padawan[] potenciales = new Padawan[padawans.length];
		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getPotencial() >= potencial)
				padawans[i].mostrarDatos();
		}
		return potenciales;
	}

	private static void mostrarJedis2maxfuerza(Jedi[] jedis) {
		Jedi[] poderosos = new Jedi[2];
		for (int i = 0; i < jedis.length; i++) {
			if (poderosos[0] == null || poderosos[0].getFuerza() < jedis[i].getFuerza()) {
				poderosos[0] = jedis[i];
			} else if (poderosos[1] == null || poderosos[1].getFuerza() < jedis[i].getFuerza()) {
				poderosos[1] = jedis[i];
			}
		}
		poderosos[0].mostrarDatos();
		poderosos[1].mostrarDatos();
	}

	private static Padawan damePadaminfuerza(Padawan[] padawans) {
		int position = 0;
		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getPotencial() > padawans[position].getPotencial())
				position = i;
		}
		return padawans[position];
	}

	private static void damePadasxletra(Padawan[] padawans, Scanner sn) {
		System.out.print("Intoduce la letra que quieres usar: ");
		char letra = sn.nextLine().charAt(0);
		for (int i = 0; i < padawans.length; i++) {
			String nombre = padawans[i].getNombre();
			if (nombre.charAt(0) == letra || nombre.charAt(nombre.length() - 1) == letra)
				padawans[i].mostrarDatos();
		}
	}

	private static Jedi[] ponerJedismayusculas(Jedi[] jedis) {
		Jedi[] modificados = jedis;
		for (int i = 0; i < jedis.length; i++) {
			modificados[i].setNombre(modificados[i].getNombre().toUpperCase());
		}
		return modificados;
	}

	private static Padawan[] ponerPadasminus(Padawan[] padawans) {
		Padawan[] modificados = padawans;
		for (int i = 0; i < padawans.length; i++) {
			padawans[i].setNombre(padawans[i].getNombre().toLowerCase());
		}
		return modificados;
	}

	private static void showMenu() {
		System.out.println("1.	Mostrar datos de todos los Jedis.");
		System.out.println("2.	Mostrar datos de todos los Padawans.");
		System.out.println("3.	Mostrar datos de un Jedi.");
		System.out.println("4.	Mostrar datos de un Padawan.");
		System.out.println("5.	Mostrar un listado con los nombres de los padawans con un mayor potencial a un valor.");
		System.out.println("6.	Mostrar los datos de los 2 Jedis que tengan más nivel de fuerza.");
		System.out.println("7.	Mostrar los datos del Padawan con menor potencial.");
		System.out.println(
				"8.	Mostrar los datos de todos los Padawans que su nombre empiece o termine por una letra concreta.");
		System.out.println("9.	Modificar todos los nombres de los Jedis y ponerlos en mayúsculas.");
		System.out.println("10.	Modificar todos los nombres de los padawans y ponerlos en minúsculas..");
	}
}
