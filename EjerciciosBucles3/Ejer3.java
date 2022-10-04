package EjerciciosBucles3;

public class Ejer3 {

	public static void main(String[] args) {
		int par = 0, impar = 0, primo = 0;
		boolean flag;

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0)
				par++;
			else
				impar++;
			flag = true;
			/* Comprobar que el numero es primo */
			for (int j = 2; j < (num - 1); j++) {
				if (num % j == 0 || num == 1) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primo++;
			}
		}
		
		System.out.println("Hay " + par + " numeros pares.");
		System.out.println("Hay " + impar + " numeros impares.");
		System.out.println("Hay " + primo + " numeros primos.");
	}

}
