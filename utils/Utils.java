package utils;

import java.util.Arrays;

public class Utils {
	public static boolean ft_isprime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int ft_word_count(String phrase) {
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ' && !flag) {
				count++;
				flag = true;
			}
			if (phrase.charAt(i) != ' ')
				flag = false;
		}

		return count;
	}

	public static String ft_strtrim(String phrase) {
		int aux = 0;
		String new_str = "";
		boolean flag = false;

		// spaces front
		while (phrase.charAt(aux) == ' ')
			aux++;
		phrase = phrase.substring(aux);

		if (phrase.length() == 0)
			return "";

		// spaces back
		aux = phrase.length() - 1;
		while (phrase.charAt(aux) == ' ')
			aux--;
		phrase = phrase.substring(0, aux + 1);

		// duplicated spaces in the middle
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ' && !flag) {
				new_str += ' ';
				flag = true;
			}
			if (phrase.charAt(i) != ' ') {
				new_str += phrase.charAt(i);
				flag = false;
			}
		}

		return new_str;
	}

	public static int ft_vowel_count(String phrase) {
		String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (vocales.contains(String.valueOf(phrase.charAt(i))))
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

	public static int[] ft_vowels_count(String phrase) {
		int[] count = { 0, 0, 0, 0, 0 };
		String vocales = "aáAÁeéEÉiíIÍoóOÓuúUÚ";

		for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < vocales.length(); j += 4) {
				if (phrase.charAt(i) == vocales.charAt(j) ||
						phrase.charAt(i) == vocales.charAt(j + 1) ||
						phrase.charAt(i) == vocales.charAt(j + 2) ||
						phrase.charAt(i) == vocales.charAt(j + 3))
					count[j/4]++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ft_vowels_count("Hello there")));
	}
}
