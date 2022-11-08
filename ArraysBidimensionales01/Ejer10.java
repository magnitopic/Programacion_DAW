package ArraysBidimensionales01;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el número de personas: ");
		int num = sc.nextInt();
		boolean[][] data = new boolean[num][3];
		String[] names = new String[num];

		for (int i = 0; i < data.length; i++) {
			System.out.print("Introduce el nombre de la persona " + i + ": ");
			names[i] = sn.nextLine();
			System.out.print("Introduce la edad el la persona: ");
			if (sc.nextInt() >= 18)
				data[i][0] = true;
			else
				data[i][0] = false;
			System.out.print("Introduce si la persona es vegana: ");
			data[i][1] = sc.nextBoolean();
			System.out.print("Introduce si la persona es poliamorosa: ");
			data[i][2] = sc.nextBoolean();
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			if (!data[i][0])
				System.out.print(" no");
			System.out.print(" es mayor de edad, ");
			if (data[i][1])
				System.out.print("no ");
			System.out.print("vegano y ");
			if (data[i][2])
				System.out.print("no ");
			System.out.print("poliamoroso.\n");
		}

		sn.close();
		sc.close();
	}
}
