package EjercicioNBA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BDController conexionBD = new BDController();
		while (true) {
			Scanner sn = new Scanner(System.in);
			System.out.println("1.\tAlta jugador");
			System.out.println("2.\tBaja jugador");
			System.out.println("3.\tListado de equipos");
			System.out.println("4.\tListado de jugadores");
			System.out.println("5.\tSalir");
			int opt = sn.nextInt();
			switch (opt) {
				case 1:

					break;
				case 2:

					break;
				case 3:
					System.out.println(conexionBD.dameJugador(1));
					break;
				case 4:

					break;
				default:
					System.out.println("Bye!");
					sn.close();
					return;
			}
		}
	}
}
