package Metodos;

public class Ejer01 {

	public static int ft_countchar(char letter, String phrase) {
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == letter)
				count++;
		}

		return count;
	}

	public static int ft_const_count(String phrase) {
		String vocales = "aeiouAEIOU";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (((phrase.charAt(i) >= 65 && phrase.charAt(i) <= 90)
					|| (phrase.charAt(i) >= 97 && phrase.charAt(i) <= 122))
					&& !vocales.contains(String.valueOf(phrase.charAt(i))))
				count++;
		}

		return count;
	}

	public static int ft_uppercase(String phrase) {
		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (abecedario.contains(String.valueOf(phrase.charAt(i))))
				count++;
		}

		return count;
	}

	public static int ft_lowercase(String phrase) {
		String abecedario = "abcdefghijkmnñopqrstuvwxyzáéíóú";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (abecedario.contains(String.valueOf(phrase.charAt(i))))
				count++;
		}

		return count;
	}

	public static String ft_longststr(String[] phrase) {
		String word = "";
		for (int i = 0; i < phrase.length; i++) {
			if (word.length() < phrase[i].length()) {
				word = phrase[i];
			}
		}

		return word;
	}

	public static void main(String[] args) {
		System.out.println(ft_countchar('l', "Hello There"));
		System.out.println(ft_const_count("Hello There"));
		System.out.println(ft_uppercase("Hello There"));
		System.out.println(ft_lowercase("Hello There"));
		System.out.println(ft_longststr("Hello There General Kenobi".split(" ")));
	}
}
