package HundirElImperio;

public class HundirElImperio {
	public static void main(String[] args) {
		String[][] tableroAlianza = new String[10][10];
		String[][] tableroImperio = new String[10][10];

		// Pedir posiciones naves a los usuarios

	}

	public static void printBoard(String[][] board, String name) {
		String[] letrasTablero = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		for (int i = 0; i < board.length; i++) {
			System.out.print(letrasTablero[i]);
			for (int j = 0; j < board[i].length; j++) {
				System.out.print();
			}
			System.out.print("\n");
		}
	}
}
