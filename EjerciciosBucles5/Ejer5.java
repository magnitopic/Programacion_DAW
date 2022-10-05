package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numSum = 0, numCount = 0;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			numSum +=num;
			numCount++;
		} while (num < 0);

		System.out.println("La media de los numeros introducidos es de " + (numSum/numCount));

		sc.close();
	}
}
