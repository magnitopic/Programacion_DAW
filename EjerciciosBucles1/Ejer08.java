package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		int secNum, userNum;
		Scanner sc = new Scanner(System.in);

		secNum = (int) (Math.random() * 100) + 1;
		do {
			System.out.print("Intenta adivinar el número secreto: ");
			userNum = sc.nextInt();
			if (userNum > secNum)
				System.out.println("El numero es menor");
			else if (userNum < secNum && userNum != -1)
				System.out.println("El numero es mayor");
		} while (secNum != userNum && userNum != -1);

		if (userNum == secNum)
			System.out.println("Felicidades! Has adivinado el numero secreto.");
		System.out.println("Fin del programa. Adiós.");

		sc.close();
	}

}
