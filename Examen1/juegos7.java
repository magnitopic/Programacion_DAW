package Examen1;

import java.util.Scanner;

public class juegos7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		int[] nums3 = new int[5];
		int[] nums4 = new int[5];
		int[] bigArray = new int[20];
		int[] aux = new int[20];
		int count = 0;

		// recoger valores para los arrays
		for (int i = 0; i < nums1.length; i++) {
			System.out.print("Introduce un numero: ");
			nums1[i] = sc.nextInt();
		}
		for (int i = 0; i < nums2.length; i++) {
			System.out.print("Introduce un numero: ");
			nums2[i] = sc.nextInt();
		}
		for (int i = 0; i < nums3.length; i++) {
			System.out.print("Introduce un numero: ");
			nums3[i] = sc.nextInt();
		}
		for (int i = 0; i < nums4.length; i++) {
			System.out.print("Introduce un numero: ");
			nums4[i] = sc.nextInt();
		}

		// juntar todos los valores un un solo array grande
		// para ahorrar tener que pasar aux por los los cuatro arrays
		for (int i = 0; i < 5; i++) {
			bigArray[i] = nums1[i];
			bigArray[i + 5] = nums2[i];
			bigArray[i + 5] = nums3[i];
			bigArray[i + 5] = nums4[i];
		}

		// recoger los numeros pares en el array aux
		for (int i = 0; i < bigArray.length; i++) {
			if (nums2[i] % 2 == 0)
				aux[count++] = bigArray[i];
		}

		// crear arrayResult e imprimir resultado
		int[] arrayResult = new int[count];
		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = aux[i];
			System.out.println(arrayResult + ", ");
		}

		sc.close();
	}
}
