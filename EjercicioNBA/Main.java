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
			System.out.println("5.\tAlta Estadística");
			System.out.println("6.\tBaja Estadística");
			System.out.println("7.\tGenerar fichero jugones");
			System.out.println("8.\tSalir");
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
					if (conexionBD.existeJugador(codigoJug) || !conexionBD.existeEquipo(nombreEquipoJug)) {
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
				case 5:
					System.out.print("La temporada: ");
					String temporada = sl.nextLine();
					System.out.print("Id del jugador: ");
					int jugadorId = sn.nextInt();
					System.out.print("Puntos por partido: ");
					float puntosPartido = sn.nextFloat();
					System.out.println("Asistencias por partido: ");
					float asitenciasPartido = sn.nextFloat();
					System.out.println("Tapones por partido: ");
					float taponesPartido = sn.nextFloat();
					System.out.println("Rebotes  por partido: ");
					float rebotesPartido = sn.nextFloat();
					if (!conexionBD.existeJugador(jugadorId) || conexionBD.existeEstadistica(temporada, jugadorId)) {
						System.out.println("Datos no validos");
						break;
					}
					Estadistica newEstadistica = new Estadistica(temporada, jugadorId, puntosPartido, asitenciasPartido,
							taponesPartido, rebotesPartido);
					conexionBD.insertEstadistica(newEstadistica);
					System.out.println("--> Nueva estadística guardada\n");
					break;
				case 6:
					System.out.println("Introduce la temporada: ");
					String teporadaDel = sl.nextLine();
					System.out.println("Introduce el ID del jugador: ");
					int jugadorIdDel = sn.nextInt();
					
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
