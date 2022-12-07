package Aerolineas;

import java.util.ArrayList;

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
}
