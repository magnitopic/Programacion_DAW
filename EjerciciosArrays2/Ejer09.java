package EjerciciosArrays2;

public class Ejer09 {
	public static void main(String[] args) {
		int[] pares = new int[20];

		for (int i = 2; i < 42; i += 2)
			pares[(i / 2) - 1] = i;

		for (int i = 0; i < 20; i++)
			System.out.print(pares[i] + ", ");
	}
}
