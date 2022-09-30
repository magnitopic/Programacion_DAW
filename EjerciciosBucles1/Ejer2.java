package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();

		if (num < 0){
			for (int i = num; i<=0; i++)
				System.out.print(i+ ", ");
		}else if (num > 0){
			for (int i = 0; i<=num; i++)
				System.out.print(i+ ", ");
		}
		else
			System.out.println("0");
		sc.close();
	}
}