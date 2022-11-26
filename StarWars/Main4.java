package StarWars;

import java.util.ArrayList;

public class Main4 {

	public static int nJedisPot(Jedi[] jedis1, Jedi[] jedis2, Jedi[] jedis3, Jedi[] jedis4, int fuerza) {
		int counter = 0;

		for (int i = 0; i < jedis1.length; i++) {
			if (jedis1[i].getFuerza() > fuerza)
				counter++;
		}
		for (int i = 0; i < jedis2.length; i++) {
			if (jedis2[i].getFuerza() > fuerza)
				counter++;
		}
		for (int i = 0; i < jedis3.length; i++) {
			if (jedis3[i].getFuerza() > fuerza)
				counter++;
		}
		for (int i = 0; i < jedis4.length; i++) {
			if (jedis4[i].getFuerza() > fuerza)
				counter++;
		}

		return counter;
	}

	public Padawan padawanPotente(Padawan[] padawans1, Padawan[] padawans2, Padawan[] padawans3) {
		Padawan potente = padawans1[0];
		for (int i = 0; i < padawans1.length; i++) {
			if (padawans1[i].getPotencial() > potente.getPotencial())
				potente = padawans1[i];
		}
		for (int i = 0; i < padawans2.length; i++) {
			if (padawans2[i].getPotencial() > potente.getPotencial())
				potente = padawans2[i];
		}
		for (int i = 0; i < padawans3.length; i++) {
			if (padawans3[i].getPotencial() > potente.getPotencial())
				potente = padawans3[i];
		}
		return potente;
	}

	public Jedi[] los7Jedis(Jedi[] jedis1, Jedi[] jedis2, Jedi[] jedis3, Jedi[] jedis4) {
		Jedi[] listaJedi = new Jedi[jedis1.length + jedis2.length + jedis3.length + jedis4.length];
		System.arraycopy(jedis1, 0, listaJedi, 0, listaJedi.length);
		System.arraycopy(jedis2, 0, listaJedi, jedis1.length, listaJedi.length);
		System.arraycopy(jedis3, 0, listaJedi, jedis2.length, listaJedi.length);
		System.arraycopy(jedis4, 0, listaJedi, jedis3.length, listaJedi.length);
		int count = 0;

		for (int i = 0; i < listaJedi.length; i++) {
			if (listaJedi[i].getNombre().length() > 7)
				count++;
		}
		Jedi[] escogidos = new Jedi[count];
		for (int i = 0; i < listaJedi.length; i++) {
			if (listaJedi[i].getNombre().length() > 7)
				escogidos[count--] = listaJedi[i];
		}
		return listaJedi;
	}

	public boolean existePadaArray(String nombre1, String nombre2, String nombre3, String nombre4, Padawan[] padawans) {
		Integer[] flags = new Integer[4];
		for (int i = 0; i < padawans.length; i++) {
			String nombre = padawans[i].getNombre();
			if (nombre.equalsIgnoreCase(nombre1))
				flags[0] = 1;
			if (nombre.equalsIgnoreCase(nombre2))
				flags[1] = 1;
			if (nombre.equalsIgnoreCase(nombre3))
				flags[2] = 1;
			if (nombre.equalsIgnoreCase(nombre4))
				flags[3] = 1;
		}
		return (flags[0] == 1 && flags[1] == 1 && flags[2] == 1 && flags[3] == 1);
	}

	public boolean fuerzaIgualPada(int fuerza1, int fuerza2, int fuerza3, Padawan[] padawans) {
		for (int i = 0; i < padawans.length; i++) {
			int fuerza = padawans[i].getFuerza();
			if (fuerza == fuerza1 || fuerza == fuerza2 || fuerza == fuerza3)
				return true;
		}
		return false;
	}

	public ArrayList<Jedi> jedisPrimosPos(Jedi[] jedis1, Jedi[] jedis2, Jedi[] jedis3) {
		ArrayList<Jedi> jedis = new ArrayList<Jedi>();
		for (int i = 0; i < jedis1.length; i++) {
			if (isPrime(i))
				jedis.add(jedis1[i]);
		}
		for (int i = 0; i < jedis2.length; i++) {
			if (isPrime(i))
				jedis.add(jedis2[i]);
		}
		for (int i = 0; i < jedis3.length; i++) {
			if (isPrime(i))
				jedis.add(jedis3[i]);
		}
		return jedis;
	}

	public int jedisFuerzaPrima(Jedi[] jedis1, Jedi[] jedis2, Jedi[] jedis3, Jedi[] jedis4) {
		int count = 0;
		for (int i = 0; i < jedis1.length; i++) {
			if (isPrime(jedis1[i].getFuerza()))
				count++;
		}
		for (int i = 0; i < jedis2.length; i++) {
			if (isPrime(jedis2[i].getFuerza()))
				count++;
		}
		for (int i = 0; i < jedis3.length; i++) {
			if (isPrime(jedis3[i].getFuerza()))
				count++;
		}
		for (int i = 0; i < jedis4.length; i++) {
			if (isPrime(jedis4[i].getFuerza()))
				count++;
		}
		return count;
	}

	public static boolean isPrime(int value) {
		if (value <= 1)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
}
