package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();

		if (num < 1){
			for (int i = num; i<=1; i++)
				System.out.print(i+ ", ");
		}else if (num > 1){
			for (int i = 1; i<=num; i++)
				System.out.print(i+ ", ");
		}
		else
			System.out.println("1");
		sc.close();
	}
}
