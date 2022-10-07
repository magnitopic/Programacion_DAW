package EjerciciosCondicionales3;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Introduzca su nombre: ");
		name = si.nextLine();
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();

		if (name.equalsIgnoreCase("Manuel") && age >= 30)
			System.out.println("Enorabuena, no todos los días se encuentra a un Manuel mayor de 30 años.");

		sc.close();
		si.close();
	}

}
