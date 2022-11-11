package ArraysBidimensionales05;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] words = new String[5][5];
		String word = "";

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				System.out.print("Introduce una palabra: ");
				words[i][j] = sc.nextLine();
				word += words[i][j] + " ";
			}
		}

		System.out.println(word);

		sc.close();
	}
}
