package StarWars;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Jedi[] jedis = new Jedi[5];
		Padawan[] padawans = new Padawan[5];
		int opt, position, j;

		// pedir datos
		for (int i = 0; i < padawans.length; i++) {
			String name, planet;
			int age, strength, potencial;
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
					for (int i = 0; i < jedis.length; i++) {
						jedis[i].mostrarDatos();
					}
					break;
				case 2:
					for (int i = 0; i < padawans.length; i++) {
						padawans[i].mostrarDatos();
					}
					break;
				case 3:
				position=0;
				i = 0;
					while(position==0 && i < jedis.length){
						if ()
					}
				break;
				case 11:
					sc.close();
					sn.close();
					return;
			}
		}

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
