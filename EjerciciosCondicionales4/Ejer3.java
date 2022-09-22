package EjerciciosCondicionales4;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, sum;
		
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		
		if (sum >= 0)
			System.out.println("La suma es " + sum);
		else {
			if (num1 >= 0)
				System.out.println(num1);
			if (num2 >= 0)
				System.out.println(num2);
			if (num3 >= 0)
				System.out.println(num3);			
		}

		sc.close();
	}

}
