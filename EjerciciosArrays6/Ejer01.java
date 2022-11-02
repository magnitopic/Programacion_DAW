package EjerciciosArrays6;

public class Ejer01 {
	public static void main(String[] args) {
		String[] partidos = { "PP", "PSOE", "CIUDADANOS", "PODEMOS", "VOX", "ERC", "JXCAT", "PNV", "EH", "CUP",
				"MASPAIS", "BNG", "PRC", "PACMA", "TERUELEXISTE" };
		int votantes = 1000;
		String[] comunidades = { "Madrid", "Castilla Y León", "Galicia", "Cataluña" };
		String[][] votosComunidades = new String[comunidades.length][votantes];

		// dar votos a cada comunidad
		for (int i = 0; i < comunidades.length; i++) {
			for (int j = 0; j < votosComunidades[i].length; j++) {
				votosComunidades[i][j] = partidos[(int) (Math.random() * partidos.length)];
			}
		}

		// contar votos de cada comunidad
		int[][] votos = new int[votosComunidades.length + 1][partidos.length];

		for (int i = 0; i < comunidades.length; i++) {
			for (int k = 0; k < votosComunidades[i].length; k++)
				votos[i][findParty(partidos, votosComunidades[i][k])]++;
		}

		// contar votos nacionales
		for (int i = 0; i < partidos.length; i++) {
			for (int j = 0; j < comunidades.length; j++) {
				votos[votos.length - 1][i] += votos[j][i];
			}
		}

		// imprimir los votos
		for (int i = 0; i < votos.length; i++) {
			if (i < (votos.length - 1))
				System.out.println("\n" + comunidades[i] + ":");
			else
				System.out.println("\nNivel nacional: ");
			for (int j = 0; j < partidos.length; j++)
				System.out.print(partidos[j] + ": " + votos[i][j] + " ");
			System.out.println("\nPartido ganador: " + partidos[findWiner(votos[i])]);
		}
	}

	public static int findWiner(int[] votos) {
		int winerPos = -1, winer = Integer.MIN_VALUE;
		for (int i = 0; i < votos.length; i++) {
			if (votos[i] > winer) {
				winer = votos[i];
				winerPos = i;
			}
		}
		return winerPos;
	}

	public static int findParty(String[] partidos, String partido) {
		for (int i = 0; i < partidos.length; i++) {
			if (partidos[i] == partido)
				return i;
		}
		return -1;
	}
}
