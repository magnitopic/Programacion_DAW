package Examen2;

public class programa7 {
	public static void main(String[] args) {
		String[] lista = { "Hello there", "the best Time", "train to Tokio" };
		System.out.println(listWords(lista, "T"));
	}

	private static String listWords(String[] cadenas, String letra) {
		String palabrasDevolver = "";
		for (int i = 0; i < cadenas.length; i++) {
			String[] palabras = cadenas[i].split(" ");
			for (int j = 0; j < palabras.length; j++) {
				if (String.valueOf(palabras[j].charAt(0)).equalsIgnoreCase(letra))
					palabrasDevolver += (palabras[j] + " ");
			}
		}
		return palabrasDevolver;
	}
}