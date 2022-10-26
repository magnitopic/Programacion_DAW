package EjerciciosString01;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names=new String[10];
		for (int i =0; i < names.length; i++){
			System.out.println("Introduce un nombre: ");
			names[i]=sc.nextLine();
			names[i]=names[i].replace("a", "X");
			names[i]=names[i].replace("o", "0");
		}

		

		sc.close();
	}
}
