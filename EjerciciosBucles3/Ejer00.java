package EjerciciosBucles3;

import java.util.Scanner;

public class Ejer00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce un numero: ");
		num2 = sc.nextInt();
		
		for (int k = 0; k < num1; k++) {
			for (int i = 0; i <= 10; i++){
				for (int j = 0; j <= num2; j++)
					System.out.print(i+" x "+j+" = "+(i*j) +" \t");
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
