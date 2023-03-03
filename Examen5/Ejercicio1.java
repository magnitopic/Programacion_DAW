import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		getTemporadasEquipos();
	}

	public static void getTemporadasEquipos() {
		BDController connexion = new BDController();
		Scanner sn = new Scanner(System.in);

		System.out.print("Introduce el nombre del equipo local: ");
		String nombreEquipoL = sn.nextLine();
		System.out.print("Introduce el nombre del equipo Visitante: ");
		String nombreEquipoV = sn.nextLine();
		System.out.print("Introduce la temporada: ");
		String temp = sn.nextLine();
		if (connexion.existeTemporada(temp) && connexion.existeEquipo(nombreEquipoV)
				&& connexion.existeEquipo(nombreEquipoL)) {
			for (String s : connexion.dameTemporadasEquipos(nombreEquipoL, nombreEquipoV, temp))
				System.out.println(s);
		} else
			System.out.println("Valores introducidos invalidos.");
		sn.close();
	}
}
