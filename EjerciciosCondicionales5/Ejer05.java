package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioKarim, salarioMariano, salarioVinicius, nGolesKarim, nGolesMariano, nGolesVinicius, incrementoSalario;

		System.out.print("Introduce el salario de Karim Benzema: ");
		salarioKarim = sc.nextInt();
		System.out.print("Introduce los goles de Karim Benzema: ");
		nGolesKarim = sc.nextInt();

		System.out.print("Introduce el salario de Mariano: ");
		salarioMariano = sc.nextInt();
		System.out.print("Introduce los goles de Mariano: ");
		nGolesMariano = sc.nextInt();

		System.out.print("Introduce el salario de Vinicius Junior: ");
		salarioVinicius = sc.nextInt();
		System.out.print("Introduce los goles Vinicius Junior: ");
		nGolesVinicius = sc.nextInt();

		incrementoSalario = (salarioKarim * (nGolesKarim/100)) + (salarioMariano * (nGolesMariano/100)) + (salarioVinicius * (nGolesVinicius/100));

		System.out.println("La subida de salario va a costar " + incrementoSalario + "€ más");
		sc.close();
	}
}
