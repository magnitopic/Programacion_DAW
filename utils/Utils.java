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
}
