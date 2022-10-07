package EjerciciosArrays1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[] regalos = new String[8];

		for (int i = 0; i < regalos.length; i++) {
			System.out.print("Introduce un regalo: ");
			regalos[i] = sn.nextLine();
		}

		for (int i = 0; i < regalos.length; i++)
			System.out.println(regalos[i]);

		for (int i = 0; i < regalos.length; i++) {
			if (regalos[i].equalsIgnoreCase("coche"))
				regalos[i] = "carbón";
		}

		for (int i = regalos.length - 1; i >= 0; i--)
			System.out.println(regalos[i]);

		for (int i = 0; i < regalos.length; i++) {
			if (regalos[i].equalsIgnoreCase("dinero") || regalos[i].equalsIgnoreCase("avión"))
				regalos[i] = null;
		}

		for (int i = 0; i < regalos.length; i++)
			regalos[i] = "Nada por feo";

		sn.close();
	}

}
