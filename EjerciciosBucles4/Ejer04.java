package EjerciciosBucles4;

public class Ejer4 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int k = 0; k<=(5-i);k++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			for (int j = 0; j < i-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
