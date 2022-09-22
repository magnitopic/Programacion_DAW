package EjerciciosCondicionales4;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num3 = sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num4 = sc.nextInt();
		
		if (num1%2==0 && num2%2==0 && num3%2==0 && num4%2==0)
			System.out.println("Todos los numeros son pares");
		else if (num1%2!=0 && num2%2!=0 && num3%2!=0 && num4%2!=0)
			System.out.println("Todos los numeros son impares");
		sc.close();
	}

}
