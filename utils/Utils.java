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

		aux = phrase.length() - 1;
		while (phrase.charAt(aux) == ' ')
			aux--;
		phrase = phrase.substring(0, aux + 1);

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

	public static void main(String[] args) {
		System.out.println(ft_strtrim("  la  casita  roja  "));
	}
}
