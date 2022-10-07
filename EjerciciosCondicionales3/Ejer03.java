package EjerciciosCondicionales3;
import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		
		if (num%2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
		sc.close();
	}

}
