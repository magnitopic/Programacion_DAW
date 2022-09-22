package EjerciciosCondicionales4;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		
		if (num%2 == 0 && num > 500)
			System.out.println("El numero es par y mayor de 500");
		sc.close();
	}

}
