package EjerciciosArrays;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[] regalos= new String[8];
		
		for (int i = 0; i < regalos.length; i++) {
			System.out.print("Introduce un regalo: ");
			regalos[i]=sn.nextLine();
		}
		
		for (int i = 0; i < regalos.length; i++)
			System.out.println(regalos[i]);
		
		for (int i = 0; i < regalos.length; i++) {
			if (regalos[i].equalsIgnoreCase("coche"))
				regalos[i] = "carbón";
		}
		
		for (int i = regalos.length-1; i >= 0; i--)
			System.out.println(regalos[i]);
		
		sn.close();
	}

}
