package EjerciciosArrays3;

public class Ejer06 {
	public static void main(String[] args) {
		int num, sixCount = 0, oneCount = 0;
		for (int i = 0; i < 5000; i++) {
			num = ((int) (Math.random() * 6)) + 1;
			if (num == 6)
				sixCount++;
			else if (num == 1)
				oneCount++;
		}
		System.out.println("Ha aparecido el numero seis " + sixCount + "veces.");
		System.out.println("Ha aparecido el numero uno " + oneCount + "veces.");
	}
}
