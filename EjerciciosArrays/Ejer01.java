package EjerciciosArrays;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[] regalos= new String[8];
		
		for (int i = 0; i < regalos.length; i++) {
			System.out.print("Introduce un regalo: ");
			regalos[i]=sn.nextLine();
		}
		
		sn.close();
	}

}
