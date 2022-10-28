package EjerciciosExtra;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] count = phrase.split(" ");

		for (int i = 0; i < count.length; i++) {
			int num = count[i].length();
			boolean flag = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag && num != 1)
				System.out.println(count[i]);
		}

		sc.close();
	}
}
