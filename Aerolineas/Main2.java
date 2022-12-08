package Aerolineas;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

	public static void sortPlanes(ArrayList<Avion> aviones) {
		Avion aux;
		boolean flag = true;

		while (flag) {
			flag = false;
			for (int i = 0; i < aviones.size() - 1; i++) {
				if (aviones.get(i).getMatricula().equalsIgnoreCase(aviones.get(+1).getMatricula())) {
					aux = aviones.get(i);
					aviones.set(i, aviones.get(i + 1));
					aviones.set(i + 1, aux);
				}
			}
		}
	}

	public static void addPlane(ArrayList<Avion> aviones, String modelo, int capacidad, String matricula,
			double capacidadDepo, int yearFabrication, Comandante comandante) {
		aviones.add(new Avion(modelo, capacidad, matricula, capacidadDepo, yearFabrication, comandante));
	}

	public static void addAirports(ArrayList<Aeropuerto> aeropuertos, ArrayList<Aeropuerto> aeropuertos1,
			ArrayList<Aeropuerto> aeropuertos2, ArrayList<Aeropuerto> aeropuertos3) {
		for (int i = 0; i < aeropuertos1.size(); i++)
			aeropuertos.add(aeropuertos1.get(i));
		for (int i = 0; i < aeropuertos2.size(); i++)
			aeropuertos.add(aeropuertos2.get(i));
		for (int i = 0; i < aeropuertos3.size(); i++)
			aeropuertos.add(aeropuertos3.get(i));
	}

	public static void removeComandante(ArrayList<Comandante> comandates, ArrayList<Comandante> comandates1,
			ArrayList<Comandante> comandates2, ArrayList<Comandante> comandates3, ArrayList<Comandante> comandates4) {
		for (int i = 0; i < comandates1.size(); i++) {
			for (int j = 0; j < comandates.size(); j++) {
				if (comandates1.get(i) == comandates.get(j))
					comandates.remove(j);
			}
		}
		for (int i = 0; i < comandates2.size(); i++) {
			for (int j = 0; j < comandates.size(); j++) {
				if (comandates2.get(i) == comandates.get(j))
					comandates.remove(j);
			}
		}
		for (int i = 0; i < comandates3.size(); i++) {
			for (int j = 0; j < comandates.size(); j++) {
				if (comandates3.get(i) == comandates.get(j))
					comandates.remove(j);
			}
		}
		for (int i = 0; i < comandates4.size(); i++) {
			for (int j = 0; j < comandates.size(); j++) {
				if (comandates4.get(i) == comandates.get(j))
					comandates.remove(j);
			}
		}
	}

	public static void sortPasangers(ArrayList<Pasajero> pasajeros) {
		Pasajero aux;
		boolean flag = true;

		while (flag) {
			flag = false;
			for (int i = 0; i < pasajeros.size() - 1; i++) {
				if (pasajeros.get(i).getEdad() < pasajeros.get(+1).getEdad()) {
					aux = pasajeros.get(i);
					pasajeros.set(i, pasajeros.get(i + 1));
					pasajeros.set(i + 1, aux);
				}
			}
		}
	}

	public static boolean checkDNI(ArrayList<Pasajero> pasajeros, String dni) {
		for (int i = 0; i < pasajeros.size(); i++) {
			if (pasajeros.get(i).getDni().equals(dni))
				return true;
		}
		return false;
	}

	public static boolean checkLicencePlate(ArrayList<Avion> aviones, String matricula) {
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i).getMatricula().equals(matricula))
				return true;
		}
		return false;
	}

	public static Aeropuerto addPlanesAirport(ArrayList<Avion> aviones1, ArrayList<Avion> aviones2,
			ArrayList<Avion> aviones3, Aeropuerto aeropuerto) {
		ArrayList<Avion> planeList = new ArrayList<Avion>(Arrays.asList(aeropuerto.getAviones()));
		for (int i = 0; i < aviones1.size(); i++)
			planeList.add(aviones1.get(i));
		for (int i = 0; i < aviones2.size(); i++)
			planeList.add(aviones2.get(i));
		for (int i = 0; i < aviones3.size(); i++)
			planeList.add(aviones3.get(i));
		Avion[] newPlanes = new Avion[planeList.size()];
		newPlanes = planeList.toArray(newPlanes);
		aeropuerto.setAviones(newPlanes);
		return aeropuerto;
	}

	public static ArrayList<Avion> planePointer(ArrayList<Avion> aviones) {
		return aviones;
	}

	public static ArrayList<Pasajero> removeValuesPasangers(ArrayList<Pasajero> pasajeros, String surname,
			char dniLetter) {
		for (int i = 0; i < pasajeros.size(); i++) {
			Pasajero pasajero = pasajeros.get(i);
			if (pasajero.getDni().charAt(pasajero.getDni().length() - 1) == dniLetter)
				pasajeros.remove(i);
			String a = pasajero.getApellidos().replace(surname, "");
			if (pasajero.getApellidos().length() - a.length() != 0)
				pasajeros.remove(i);
		}
		return pasajeros;
	}

	public static void removePassangers(ArrayList<Vuelo> vuelos, ArrayList<String> telefonos) {
		for (int i = 0; i < vuelos.size(); i++) {
			for (int j = 0; j < vuelos.get(i).getPasajeros().length; j++) {
				Pasajero pasajero = vuelos.get(i).getPasajeros()[j];
				for (int j2 = 0; j2 < telefonos.size(); j2++) {
					if (pasajero.getTelefono().equals(telefonos.get(j2)))
						vuelos.get(i).getPasajeros()[j] = null;
				}
			}
		}
	}

	public static ArrayList<Comandante> getPilots(ArrayList<Aeropuerto> aeropuertos, String[] rango) {
		ArrayList<Comandante> comandantes = new ArrayList<>();
		for (int i = 0; i < aeropuertos.size(); i++) {
			for (int j = 0; j < aeropuertos.get(i).getAviones().length; j++) {
				for (int j2 = 0; j2 < rango.length; j2++) {
					if (aeropuertos.get(i).getAviones()[j].getComandante().getRango().equalsIgnoreCase(rango[j2]))
						comandantes.add(aeropuertos.get(i).getAviones()[j].getComandante());
				}
			}
		}
		return comandantes;
	}

	public static ArrayList<Aeropuerto> findPlanes(ArrayList<Aeropuerto> aeropuertos, String[] matriculas) {
		ArrayList<Aeropuerto> aeropuertosConAviones = new ArrayList<>();
		for (int i = 0; i < aeropuertos.size(); i++) {
			boolean flag = false;
			for (int j = 0; j < aeropuertos.get(i).getAviones().length; j++) {
				for (int k = 0; k < matriculas.length; k++) {
					if (aeropuertos.get(i).getAviones()[j].getMatricula().equals(matriculas[k]))
						flag = true;
				}
			}
			if (flag)
				aeropuertosConAviones.add(aeropuertos.get(i));
		}
		return aeropuertosConAviones;
	}

	public static ArrayList<Pasajero> findPassangers(ArrayList<Vuelo> vuelos) {
		ArrayList<Pasajero> pasajeros = new ArrayList<>();
		for (int i = 0; i < vuelos.size(); i++) {
			for (int j = 0; j < vuelos.get(i).getPasajeros().length; j++) {
				if (vuelos.get(i).getPasajeros()[j].getEdad() >= 18)
					pasajeros.add(vuelos.get(i).getPasajeros()[j]);
			}
		}
		return pasajeros;
	}
}
