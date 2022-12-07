package Aerolineas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Avion> aviones = new ArrayList<Avion>();
		ArrayList<Comandante> comandantes = new ArrayList<Comandante>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
		ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		int opt;
		while (true) {
			showMenu();
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					Avion newPlane = newPlane(aviones);
					if (newPlane != null)
						aviones.add(newPlane);
					break;
				case 2:
					Comandante newCommander = newComander(comandantes);
					if (newCommander != null)
						comandantes.add(newCommander);
					break;
				case 3:
					Aeropuerto newAirport = newAirport(aeropuertos);
					if (newAirport != null)
						aeropuertos.add(newAirport);
					break;
				case 4:
					Pasajero newPasajero = newPasajero(pasajeros);
					if (newPasajero != null)
						pasajeros.add(newPasajero);
					break;
				case 5:
					Vuelo newFlight = newFlight(vuelos);
					if (newFlight != null)
						vuelos.add(newFlight);
					break;
				case 6:
					for (int i = 0; i < aviones.size(); i++)
						aviones.get(i).mostrarDatosAvion();
					break;
				case 7:
					for (int i = 0; i < comandantes.size(); i++)
						comandantes.get(i).mostrarDatosComandante();
					break;
				case 8:
					for (int i = 0; i < aeropuertos.size(); i++)
						aeropuertos.get(i).mostrarDatosAeropuerto();
					;
					break;
				case 9:
					for (int i = 0; i < pasajeros.size(); i++)
						pasajeros.get(i).mostrarDatosPasajero();
					break;
				case 10:
					for (int i = 0; i < vuelos.size(); i++)
						vuelos.get(i).mostrarDatosVuelo();
					break;
				default:
					sc.close();
					return;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1.	Insertar 1 avión en el array de aviones.");
		System.out.println("2.	Insertar 1 comandante en el array de comandates");
		System.out.println("3.	Inserar 1 Aeropuerto en el array de aeropuertos");
		System.out.println("4.	Insertar 1 pasajero en el array de pasajeros");
		System.out.println("5.	Insertar 1 vuelo en el array de vuelos");
		System.out.println("6.	Mostrar datos de todos los aviones");
		System.out.println("7.	Mostar datos de todos los comandantes");
		System.out.println("8.	Mostar datos de todos los aeropuertos");
		System.out.println("9.	Mostar datos de todos los pasajeros");
		System.out.println("10.	Mostar datos de todos los vuelos");
		System.out.println("11.	Salir");
		System.out.print("--> ");
	}

	public static Avion newPlane(ArrayList<Avion> aviones) {
		String licencePlate = "";
		for (int i = 0; i < 4; i++)
			licencePlate += (int) randomNum(9, 1);
		for (int i = 0; i < 3; i++)
			licencePlate += (char) ((int) randomNum(90, 65));
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i).getMatricula() == licencePlate)
				return null;
		}
		return new Avion("BX23723", 543, licencePlate, 4354.32, 2007, new Comandante("627431D"));
	}

	public static Comandante newComander(ArrayList<Comandante> comandantes) {
		String dni = "";
		for (int i = 0; i < 8; i++)
			dni += (int) randomNum(9, 1);
		dni += (char) ((int) randomNum(90, 65));
		for (int i = 0; i < comandantes.size(); i++) {
			if (comandantes.get(i).getDni() == dni)
				return null;
		}
		return new Comandante("Felipe", "Rodrigez Gutierrez", "54632932", dni, 32, "Cabo");
	}

	public static Aeropuerto newAirport(ArrayList<Aeropuerto> aeropuertos) {
		int airportCode = 0;
		for (int i = 0; i < 8; i++)
			airportCode += (int) randomNum(9, 1);
		for (int i = 0; i < aeropuertos.size(); i++) {
			if (aeropuertos.get(i).getCodigo_aeropuerto() == airportCode)
				return null;
		}
		return new Aeropuerto("Barajas", "Madrid", airportCode, null);
	}

	public static Pasajero newPasajero(ArrayList<Pasajero> pasajeros) {
		String dni = "";
		for (int i = 0; i < 8; i++)
			dni += (int) randomNum(9, 1);
		dni += (char) ((int) randomNum(90, 65));
		for (int i = 0; i < pasajeros.size(); i++) {
			if (pasajeros.get(i).getDni() == dni)
				return null;
		}
		return new Pasajero("Monica", "Callado", "2345454", dni, 47);
	}

	public static Vuelo newFlight(ArrayList<Vuelo> vuelos) {
		int flightCode = 0;
		for (int i = 0; i < 8; i++)
			flightCode += (int) randomNum(9, 1);
		for (int i = 0; i < vuelos.size(); i++) {
			if (vuelos.get(i).getCod_vuelo() == flightCode)
				return null;
		}
		return new Vuelo(flightCode, null, null, null, null);
	}

	// Auxiliares
	public static double randomNum(int max, int min) {
		return Math.random() * (max - min + 1) + min;
	}
}
