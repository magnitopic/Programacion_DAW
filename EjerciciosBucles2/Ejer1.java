package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos, len=0, aux, i = 0;
		
		do {
			System.out.print("Introduce un numero: ");
			aux = sc.nextInt();
			i++;
			if (aux > len) {
				len = aux;
				pos = i;
			}
		}while(aux != -1);
		
		sc.close();
	}

}
