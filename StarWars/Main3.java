package StarWars;

public class Main3 {
	public static void main(String[] args) {

	}

	private static int[] fuerzasJedis(Jedi[] jedis) {
		int[] fuerzas = new int[jedis.length];

		for (int i = 0; i < jedis.length; i++)
			fuerzas[i] = jedis[i].getFuerza();
		return fuerzas;
	}

	private static void nombresEdadFu(int edadMin, int edadMax, int fuerza, Padawan[] padawans) {
		for (int i = 0; i < padawans.length; i++) {
			int edad = padawans[i].getEdad();
			if ((edad > edadMin && edad < edadMax) && padawans[i].getFuerza() >= fuerza)
				System.out.println(padawans[i].getNombre());
		}
	}

	private static String[] esmirriados(Padawan[] padawans) {
		String[] esmirriados = new String[6];
		Padawan[] padawnsEsmirriados = new Padawan[6];
		for (int i = 0; i < padawans.length; i++) {
			for (int j = 0; j < esmirriados.length; j++) {
				if (padawnsEsmirriados[j] == null || padawans[i].getFuerza() > padawnsEsmirriados[j].getFuerza()) {
					padawnsEsmirriados[j] = padawans[i];
					esmirriados[j] = Integer.toString(padawnsEsmirriados[j].getFuerza());
					break;
				}
			}
		}
		return esmirriados;
	}
	private static String[] variosNombres(Padawan[] padawans, Jedi[] jedis, int fuerza) {
		int counter = 0;
		for (int i = 0; i < jedis.length; i++) {
			if (jedis[i].getFuerza() > fuerza)
				counter++;
		}
		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getFuerza() > fuerza)
				counter++;
		}

		String[] nombres = new String[counter];
		for (int i = 0; i < jedis.length; i++) {
			if (jedis[i].getFuerza() > fuerza) {
				counter--;
				nombres[counter] = jedis[i].getNombre();
			}
		}
		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getFuerza() > fuerza) {
				counter--;
				nombres[counter] = padawans[i].getNombre();
			}
		}
		return nombres;
	}

	private static Padawan[] padawansFuertacos(Padawan[] padawans, int fuerza) {
		int counter = 0;
		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getFuerza() > fuerza)
				counter++;
		}

		Padawan[] resultado = new Padawan[counter];

		for (int i = 0; i < padawans.length; i++) {
			if (padawans[i].getFuerza() > fuerza) {
				counter--;
				resultado[counter] = padawans[i];
			}
		}
		return resultado;
	}
}
