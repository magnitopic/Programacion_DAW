package EjerciciosCondicionales3;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("Introduzca su nombre: ");
		name = sc.nextLine();
		
		if (name.equalsIgnoreCase("Antonio") || name.equalsIgnoreCase("Pepe") || name.equalsIgnoreCase("Juan") || name.equalsIgnoreCase("Carlos"))
			System.out.println("Ud queda expulsado del centro");
		else
			System.out.println("Bienvendo al centro");
		sc.close();
	}

}
