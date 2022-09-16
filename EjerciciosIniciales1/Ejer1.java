import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name;
		
		System.out.print("Introduzca su nombre y apellido: ");
		name = sn.nextLine();
		System.out.println("Ud se llama " + name);
		sn.close();
	}

}
