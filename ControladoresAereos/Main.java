package ControladoresAereos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opt;

		// Objetos y sus valores
		ArrayList<Controlador> controladores = new ArrayList<>();
		ArrayList<Aerolinea> aerolineas = new ArrayList<>();
		ArrayList<Avion> aviones = new ArrayList<>();
		ArrayList<Vuelo> vuelos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			controladores.add(newControlador());
			aerolineas.add(newAerolinea());
			aviones.add(newAvion());
			vuelos.add(newVuelos());
		}

		while (true) {
			showMenu();
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					opt1(controladores, aerolineas, aviones, vuelos);
					break;
				case 2:
					opt2(controladores, aerolineas, aviones, vuelos);
					break;
				case 3:
					opt3(controladores, aerolineas, aviones, vuelos);
				case 4:
					opt4(controladores, aerolineas, aviones, vuelos);
					break;
				case 5:
					opt5(controladores, aerolineas, aviones, vuelos);
					break;
				case 6:
					opt6(aviones).showData();
					break;
				case 7:
					opt7(aviones).showData();
					break;
				case 8:
					opt8(controladores);
					break;
				case 9:
					Controlador[] respuesta1 = opt9(controladores);
					for (int i = 0; i < respuesta1.length; i++)
						respuesta1[i].showData();
					break;
				case 10:
					Vuelo[] respueta2 = opt10(vuelos);
					for (int i = 0; i < respueta2.length; i++)
						respueta2[i].showData();
					break;
				default:
					System.out.println("Adiós.");
					sc.close();
					sn.close();
					return;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1.	Buscar");
		System.out.println("2.	Mostrar Datos");
		System.out.println("3.	Aumentar capacidad de depósito a Avión");
		System.out.println("4.	Sumar puntos de experiencia a controlador");
		System.out.println("5.	Aumentar capacidad de pasajeros de un Avión");
		System.out.println("6.	Mostrar datos del Avión con mayor depósito");
		System.out.println("7.	Mostrar Datos del Avión con menos capacidad de pasajeros");
		System.out.println("8.	Mostar los datos del controlador con mayor experiencia");
		System.out.println("9.	Mostar los datos de los 3 controladores con mayor experiencia");
		System.out.println("10.	Mostrar los datos de los 2 vuelos menos caros");
		System.out.println("11.	Salir");
		System.out.print("--> ");
	}

	// Opciones

	public static void opt1(ArrayList<Controlador> controladores, ArrayList<Aerolinea> aerolineas,
			ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos) {
		int opt2;
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String name;
		System.out.println("1.	Aerolíneas");
		System.out.println("2.	Aviones");
		System.out.println("3.	Vuelos");
		System.out.println("4.	Controladores");
		System.out.print("--> ");
		opt2 = sc.nextInt();
		switch (opt2) {
			case 1:
				System.out.print("Introduce el nombre de la aerolinea: ");
				name = sn.nextLine();
				Aerolinea selected1 = searchNameAerolinea(aerolineas, name);
				if (selected1 == null)
					System.out.println("Aerolinea no encontrada.");
				else
					selected1.showData();
				break;
			case 2:
				System.out.print("Introduce la matricula del avión: ");
				name = sn.nextLine();
				Avion selected2 = searchLicenceplate(aviones, name);
				if (selected2 == null)
					System.out.println("Avión no encontrado.");
				else
					selected2.showData();
				break;
			case 3:
				System.out.print("Introduce el numero de vuelo: ");
				int value = sc.nextInt();
				Vuelo selected3 = searchFlightNum(vuelos, value);
				if (selected3 == null)
					System.out.println("Vuelo no encontrado.");
				else
					selected3.showData();
				break;
			case 4:
				System.out.print("Introduce el DNI del controlador: ");
				name = sn.nextLine();
				Controlador selected4 = searchDni(controladores, name);
				if (selected4 == null)
					System.out.println("Controlador no existente.");
				else
					selected4.showData();
				break;
			default:
				System.out.println("Opción no valida.");
				break;
		}
		sc.close();
		sn.close();
	}

	public static void opt2(ArrayList<Controlador> controladores, ArrayList<Aerolinea> aerolineas,
			ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos) {
		int opt2;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.	Aerolíneas");
		System.out.println("2.	Aviones");
		System.out.println("3.	Vuelos");
		System.out.println("4.	Controladores");
		System.out.print("--> ");
		opt2 = sc.nextInt();
		for (int i = 0; i < controladores.size(); i++) {
			if (opt2 == 1)
				aerolineas.get(i).showData();
			if (opt2 == 2)
				aviones.get(i).showData();
			if (opt2 == 3)
				vuelos.get(i).showData();
			if (opt2 == 4)
				controladores.get(i).showData();
			System.out.print("\n");
		}
		sc.close();
	}

	public static void opt3(ArrayList<Controlador> controladores, ArrayList<Aerolinea> aerolineas,
			ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce la matricula del avión: ");
		String licencePlate = sn.nextLine();
		Avion selected = searchLicenceplate(aviones, licencePlate);
		if (selected == null)
			System.out.println("Avión no encontrado.");
		else {
			System.out.print("Introduce por cuanto quieres incrementar el deposito: ");
			int catidad = sc.nextInt();
			System.out.println("Capacidad del deposito previamente: " + selected.getCapacidadDepo());
			selected.setCapacidadDepo(selected.getCapacidadDepo() + catidad);
			System.out.println("Capacidad del deposito actuales: " + selected.getCapacidadDepo());
		}
		sn.close();
		sc.close();
	}

	public static void opt4(ArrayList<Controlador> controladores, ArrayList<Aerolinea> aerolineas,
			ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el DNI del controlador: ");
		String dni = sn.nextLine();
		Controlador selected = searchDni(controladores, dni);
		if (selected == null)
			System.out.println("Controlador no existente.");
		else {
			System.out.print("Introduce por cuanto quieres incrementar los puntos de experiencia: ");
			int newXP = sc.nextInt();
			System.out.println("Puntos de experiencia previos: " + selected.getAnosExp());
			selected.setAnosExp(selected.getAnosExp() + newXP);
			System.out.println("Puntos de experiencia actuales: " + selected.getAnosExp());
		}
		sn.close();
		sc.close();
	}

	public static void opt5(ArrayList<Controlador> controladores, ArrayList<Aerolinea> aerolineas,
			ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce la matricula del avión: ");
		String licencePlate = sn.nextLine();
		Avion selected = searchLicenceplate(aviones, licencePlate);
		if (selected == null)
			System.out.println("Avión no encontrado.");
		else {
			System.out.print("Introduce por cuanto quieres incrementar la capacidad de los pasajeros: ");
			int catidad = sc.nextInt();
			System.out.println("Capacidad de pasajeros anterior: " + selected.getCapacidadDepo());
			selected.setCapacidadDepo(selected.getCapacidadDepo() + catidad);
			System.out.println("Capacidad de pasajeros actuales: " + selected.getCapacidadDepo());
		}
		sn.close();
		sc.close();
	}

	public static Avion opt6(ArrayList<Avion> aviones) {
		double max = 0;
		int pos = 0;
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i).getCapacidadDepo() > max) {
				max = aviones.get(i).getCapacidadDepo();
				pos = i;
			}
		}
		return aviones.get(pos);
	}

	public static Avion opt7(ArrayList<Avion> aviones) {
		double min = Double.MAX_VALUE;
		int pos = 0;
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i).getCatPasajeros() < min) {
				min = aviones.get(i).getCatPasajeros();
				pos = i;
			}
		}
		return aviones.get(pos);
	}

	public static Controlador opt8(ArrayList<Controlador> controladores) {
		double max = 0;
		int pos = 0;
		for (int i = 0; i < controladores.size(); i++) {
			if (controladores.get(i).getDestreza() > max) {
				max = controladores.get(i).getDestreza();
				pos = i;
			}
		}
		return controladores.get(pos);
	}

	public static Controlador[] opt9(ArrayList<Controlador> controladores) {
		Controlador[] expretos = new Controlador[3];

		for (int i = 0; i < controladores.size(); i++) {
			if (expretos[0] == null || expretos[0].getAnosExp() < controladores.get(i).getAnosExp()) {
				expretos[0] = controladores.get(i);
				break;
			}
			if (expretos[1] == null || expretos[1].getAnosExp() < controladores.get(i).getAnosExp()) {
				expretos[1] = controladores.get(i);
				break;
			}
			if (expretos[2] == null || expretos[2].getAnosExp() < controladores.get(i).getAnosExp()) {
				expretos[2] = controladores.get(i);
				break;
			}
		}

		return expretos;
	}

	public static Vuelo[] opt10(ArrayList<Vuelo> vuelos) {
		Vuelo[] baratos = new Vuelo[2];

		for (int i = 0; i < vuelos.size(); i++) {
			if (baratos[0] == null || baratos[0].getPrecio() > vuelos.get(i).getPrecio()) {
				baratos[0] = vuelos.get(i);
				break;
			}
			if (baratos[1] == null || baratos[1].getPrecio() > vuelos.get(i).getPrecio()) {
				baratos[1] = vuelos.get(i);
				break;
			}
		}

		return baratos;
	}

	// Auxiliares
	public static double randomNum(int max, int min) {
		return Math.random() * (max - min + 1) + min;
	}

	// Buscar objetos

	public static Avion searchLicenceplate(ArrayList<Avion> aviones, String licencePlate) {
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i).getMatricula().equalsIgnoreCase(licencePlate))
				return aviones.get(i);
		}
		return null;
	}

	public static Aerolinea searchNameAerolinea(ArrayList<Aerolinea> aerolineas, String name) {
		for (int i = 0; i < aerolineas.size(); i++) {
			if (aerolineas.get(i).getNombre().equalsIgnoreCase(name))
				return aerolineas.get(i);
		}
		return null;
	}

	public static Vuelo searchFlightNum(ArrayList<Vuelo> vuelos, int flightNum) {
		for (int i = 0; i < vuelos.size(); i++) {
			if (vuelos.get(i).getNVuelo() == flightNum)
				return vuelos.get(i);
		}
		return null;
	}

	public static Controlador searchDni(ArrayList<Controlador> controladores, String dni) {
		for (int i = 0; i < controladores.size(); i++) {
			if (controladores.get(i).getDni().equalsIgnoreCase(dni))
				return controladores.get(i);
		}
		return null;
	}

	// Crear datos
	public static Controlador newControlador() {
		String[] names = { "Robert", "Frank", "Lucia", "Matilda", "Brooklyn", "Laurel", "Dallas" };
		String[] surnames = { "Jones", "Dickson", "Fields", "Madden", "Christensen", "Brewer", "Tate" };
		// Generar DNI
		String dni = "";
		for (int i = 0; i < 8; i++)
			dni += (int) randomNum(9, 1);
		dni += (char) ((int) randomNum(90, 65));
		int anoNac = (int) randomNum(2022, 1940);
		int anosExp = (int) randomNum(45, 0);
		int destreza = (int) randomNum(100, 1);

		return new Controlador(names[(int) (randomNum(names.length - 1, 0))],
				surnames[(int) (randomNum(surnames.length - 1, 0))], dni, anoNac, anosExp, destreza);
	}

	public static Aerolinea newAerolinea() {
		String[][] datos = { { "Air Nostrum", "ESP" }, { "Air Europa", "ESP" }, { "Iberia", "ESP" },
				{ "Lufthansa", "DEU" }, { "Eurowings", "DEU" }, { "Brithish Airways", "GBR" },
				{ "Cayman Airways", "GBR" }, { "Air France", "FRA" }, { "KLM", "NLD" }, { "United Airlines", "USA" },
				{ "Delta Airlines", "USA" }, { "US Airways", "USA" } };
		int rnd = (int) randomNum(datos.length - 1, 0);
		return new Aerolinea(datos[rnd][0], datos[rnd][1]);
	}

	public static Avion newAvion() {
		String[] brand = { "Airbus", "Boeing" };
		String model = "";
		for (int i = 0; i < 2; i++)
			model += (int) randomNum(9, 1);
		for (int i = 0; i < 3; i++)
			model += (char) ((int) randomNum(90, 65));
		for (int i = 0; i < 4; i++)
			model += (int) randomNum(9, 1);
		double depo = randomNum(1000, 100);
		int pasangers = (int) randomNum(9, 1);
		String licencePlate = "";
		for (int i = 0; i < 4; i++)
			licencePlate += (int) randomNum(9, 1);
		for (int i = 0; i < 3; i++)
			licencePlate += (char) ((int) randomNum(90, 65));
		return new Avion(brand[Math.random() > 5 ? 1 : 0], model, depo, pasangers, licencePlate);
	}

	public static Vuelo newVuelos() {
		int num = (int) randomNum(90, 65);
		String[] dest = { "Madrid", "Manchester", "Londres", "Nueva York", "Berlin", "Bruselas", "Tokio", "Sidney",
				"Montreal", "Los Angeles", "Praga" };
		double price = (randomNum(2500, 20));
		return new Vuelo(num, dest[(int) randomNum(dest.length - 1, 0)], price);
	}
}
