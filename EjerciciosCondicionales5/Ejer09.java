package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aux;

		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();


		if (num1 > num2)
		{
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		System.out.println("La división entre " + num1 + " y " + num2 + " es: "+ (num1/num2));

		sc.close();
	}
}
