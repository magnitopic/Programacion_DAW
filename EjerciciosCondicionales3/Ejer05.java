package EjerciciosCondicionales3;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary;
		
		System.out.print("Introduzca su sueldo: ");
		salary = sc.nextDouble();
		
		if (salary > 2000)
			System.out.println("El sueldo se queda en: " + (salary - (salary * .45)) + "€");
		else if (salary > 1000)
			System.out.println("El sueldo se queda en: " + (salary - (salary * .1)) + "€");
		else if (salary > 700)
			System.out.println("El sueldo se queda en: " + (salary - (salary * .04)) + "€");
		else
			System.out.println("El sueldo se queda en: " + (salary - (salary * .02)) + "€");
		
		sc.close();
	}

}
