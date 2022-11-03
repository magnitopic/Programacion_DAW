package utils;

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

	public static int ft_vocal_count(String phrase) {
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (phrase.charAt(i) == vocales[j])
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(ft_vocal_count("    Hello There   "));
	}
}
