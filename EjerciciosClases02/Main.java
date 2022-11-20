package EjerciciosClases02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jugador jugon = new Jugador("Alex", "magnitopic", "calle", "madrid", "España", 18, 0, 42, 23, 43, 52, 1, 33,
				434);
		System.out.println("Introduce el nombre del jugador.");
		jugon.setNombre(sc.nextLine());
		jugon.setPpp(0);
		System.out.println("Nombre: " + jugon.getNombre() + " Apellidos: " + jugon.getApellidos()
				+ " Puntos por partido: " + jugon.getPpp());
		
		sc.close();
	}
}
