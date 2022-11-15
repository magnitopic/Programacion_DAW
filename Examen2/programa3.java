package Examen2;

public class programa3 {
	public static void main(String[] args) {

		System.out.println(dameNpunles("Voy a sacar, un notable. Sí o sí."));
	}

	private static String dameNpunles(String cadena) {
		if (cadena.length() < 9)
			return "Error";

		String cadenaNueva = "";
		for (int i = 4; i < 9; i++)
			cadenaNueva += cadena.charAt(i);

		return cadenaNueva;
	}
}