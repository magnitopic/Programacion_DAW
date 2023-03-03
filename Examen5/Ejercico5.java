import java.util.ArrayList;

public class Ejercico5 {
	public static void main(String[] args) {
		for (Jugador j : jugadoresEspecificos())
			System.out.println(j.getNombre());
	}

	public static ArrayList<Jugador> jugadoresEspecificos() {
		BDController connexion = new BDController();
		ArrayList<Jugador> jugadoresIniciales = connexion.dameJugadores();
		ArrayList<Jugador> jugadoresFiltrados = new ArrayList<Jugador>();
		for (Jugador j : jugadoresIniciales) {
			if (Integer.valueOf(j.getAltura().charAt(0)) > 7 && isVowel(j.getNombre_equipo().charAt(5)))
				jugadoresFiltrados.add(j);
		}
		return jugadoresFiltrados;
	}

	public static boolean isVowel(char caracter) {
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		for (char c : vocales) {
			if (caracter == c)
				return true;
		}
		return false;
	}
}
