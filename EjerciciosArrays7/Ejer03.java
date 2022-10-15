package EjerciciosArrays7;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduce cuantos numeros se van a introducir: ");
		num = sc.nextInt();

		if (num < 6){			
			sc.close();
			return;
		}

		int[] nums=new int[num];
		for (int i = 0; i < num; i++){
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Primmero: "+nums[0]);
		System.out.println("Último: "+nums[num-1]);
		System.out.println("Antepenúltimo: "+nums[num-2]);
		for (int i = 1; i < 4; i++){
			System.out.println((i+1) + "º: "+nums[i]);
		}

		sc.close();
	}
}
