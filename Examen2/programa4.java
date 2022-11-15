package Examen2;

public class programa4 {
	public static void main(String[] args) {
		double[] prueba = { 5.5, 6.7, 4.8, 2.2, 1.0 };
		System.out.println(multiDoubles(prueba));
	}

	private static double multiDoubles(double[] numeros) {
		double multiplicacion = 1;

		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0)
				multiplicacion *= numeros[i];
		}

		return multiplicacion;
	}
}
