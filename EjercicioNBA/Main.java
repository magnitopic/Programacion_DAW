package EjercicioNBA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BDController conexionBD = new BDController();
		Scanner sn = new Scanner(System.in);
		Scanner sl = new Scanner(System.in);
		while (true) {
			System.out.println("1.\tAlta jugador");
			System.out.println("2.\tBaja jugador");
			System.out.println("3.\tListado de equipos");
			System.out.println("4.\tListado de jugadores");
			System.out.println("5.\tSalir");
			System.out.print("--> ");
			int opt = sn.nextInt();
			switch (opt) {
				case 1:
					System.out.print("Código del jugador: ");
					int codigoJug = sn.nextInt();
					System.out.print("Nombre del jugador: ");
					String nombreJug = sl.nextLine();
					System.out.print("Procedencia: ");
					String procedenciaJug = sl.nextLine();
					System.out.print("Altura: ");
					String alturaJug = sl.nextLine();
					System.out.print("Peso: ");
					int pesoJug = sn.nextInt();
					System.out.print("Posición: ");
					String posicionJug = sl.nextLine();
					System.out.print("Nombre del equipo: ");
					String nombreEquipoJug = sl.nextLine();
					if (conexionBD.existeJugador(codigoJug) || conexionBD.existeEquipo(nombreEquipoJug)) {
						System.out.println("Valores no validos");
						break;
					}
					Jugador newJugador = new Jugador(codigoJug, alturaJug, nombreJug, nombreEquipoJug, pesoJug,
							posicionJug, procedenciaJug);
					conexionBD.insertJugador(newJugador);
					System.out.println("Nuevo jugador guardado");
					break;
				case 2:
					System.out.print("Código del jugador: ");
					int codigoBajaJug = sn.nextInt();
					if (conexionBD.existeJugador(codigoBajaJug)) {
						conexionBD.eliminarJugador(codigoBajaJug);
						System.out.println("Jugador eliminado correctamente");
					} else
						System.out.println("No existe el jugador");
					break;
				case 3:
					for (Equipo e : conexionBD.dameEquipos())
						e.printData();
					break;
				case 4:
					for (Jugador e : conexionBD.dameJugadores())
						e.printData();
					break;
				default:
					System.out.println("Bye!");
					sn.close();
					sl.close();
					return;
			}
		}
	}
}
