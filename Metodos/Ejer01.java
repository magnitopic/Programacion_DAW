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
		String vocales = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (vocales.contains(String.valueOf(phrase.charAt(i))))
				count++;
		}

		return count;
	}

	public static int ft_lowercase(String phrase) {
		String vocales = "abcdefghijkmnñopqrstuvwxyzáéíóú";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (vocales.contains(String.valueOf(phrase.charAt(i))))
				count++;
		}

		return count;
	}

	public static String ft_logststr(String phrase) {
		String word = "";

		String[] words = phrase.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (word.length() < words[i].length()) {
				word = words[i];
			}
		}

		return word;
	}

	public static void main(String[] args) {
		System.out.println(ft_countchar('l', "Hello There"));
		System.out.println(ft_const_count("Hello There"));
		System.out.println(ft_uppercase("Hello There"));
		System.out.println(ft_lowercase("Hello There"));
		System.out.println(ft_logststr("Hello There General Kenobi"));
	}
}
