package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String birth;
		String street;
		String brother;
		String user;
		String travel;
		String book;
		String friend;
		String bank;
		String thing;
		
		System.out.print("Introduce tu nombre: ");
		name=sc.nextLine();
		System.out.print("Introduce tu lugar de nacimiento: ");
		birth=sc.nextLine();
		System.out.print("Introduce en que dirección vives: ");
		street=sc.nextLine();
		System.out.print("Introduce el nombre de un hermano: ");
		brother=sc.nextLine();
		System.out.print("Introduce tu nombre de usuario: ");
		user=sc.nextLine();
		System.out.print("Introduce tu destino de viaje favorito: ");
		travel=sc.nextLine();
		System.out.print("Introduce tu libro favorito: ");
		book=sc.nextLine();
		System.out.print("Introduce el nombre de tu mejor amigo: ");
		friend=sc.nextLine();
		System.out.print("Introduce tu numero de cuenta bancaria: ");
		bank=sc.nextLine();
		System.out.print("Introduce algo con lo que no puedas vivir: ");
		thing=sc.nextLine();
		
		System.out.println("Te llamas " + name);
		System.out.println("Naciste en " + birth);
		System.out.println("Vives en " + street);
		System.out.println("Tu hermano se llama " + brother);
		System.out.println("Tu nombre de usuario es " + user);
		System.out.println("Te  gusta viajar a " + travel);
		System.out.println("Tu libro favorioto es " + book);
		System.out.println("Tu mejor amigo se llama " + friend);
		System.out.println("Tu numero de cuenta bancaria es " + bank);
		System.out.println("No puedes vivir sin " + thing);
		
		sc.close();
	}

}
