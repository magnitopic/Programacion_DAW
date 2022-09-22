package EjerciciosCondicionales3;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nJugadores, nComunitarios, nExtranjeros, presupuesto;
		
		System.out.print("Introduzca el numero de jugadores: ");
		nJugadores = sc.nextInt();
		System.out.print("Introduzca cuantos con comunitarios: ");
		nComunitarios = sc.nextInt();
		System.out.print("Introduzca cuantos son extranjeros: ");
		nExtranjeros = sc.nextInt();
		
		presupuesto = nJugadores * 2;
		if (nComunitarios > 5)
			presupuesto += 5;
		if (nExtranjeros >= 2)
			presupuesto += 5;
		
		System.out.println("El coste total de la plantilla es de " + presupuesto + " M de €");

		sc.close();
	}

}
