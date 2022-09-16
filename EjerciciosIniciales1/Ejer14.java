import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String name;
		int velocidad;
		int fuerza;
		int defensa;
		int dribling;
		int pase;
		int average;
		

		System.out.print("Introduce tu nombre: ");
		name=sn.nextLine();
		System.out.print("Introduce valor de Velocidad: ");
		velocidad=sc.nextInt();
		System.out.print("Introduce valor de Fuerza: ");
		fuerza=sc.nextInt();
		System.out.print("Introduce valor de Defensa: ");
		defensa=sc.nextInt();
		System.out.print("Introduce valor de Dribling: ");
		dribling=sc.nextInt();
		System.out.print("Introduce valor de Pase: ");
		pase=sc.nextInt();

		average = (velocidad + fuerza + defensa + dribling + pase)/5;

		System.out.println("El jugador " + name + " tiene un valor conjunto de " + average);

		sn.close();
		sc.close();
	}
}