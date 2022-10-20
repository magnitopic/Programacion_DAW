package HundirElImperio;

public class HundirElImperio {

  public static void main(String[] args) {
	String[][] tableroAlianza = new String[10][10];
	String[][] tableroImperio = new String[10][10];

	// Pedir posiciones de naves a los usuarios
	printBoard(tableroAlianza, "Alianza");
  }

	public static void printBoard(String[][] board, String name) {
	String[] letrasTablero = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
	for (int j = 0; j < board.length * 2 + 1; j++) 
		System.out.print("- ");
	
	System.out.print("\n");
	for (int i = 0; i < name.length(); i++) 
		System.out.print("    " + name.charAt(i));
	
	System.out.print("\n");
	for (int j = 0; j < board.length * 2 + 1; j++) 
		System.out.print("- ");

	System.out.print("\n    ");
	for (int i = 0; i < 10; i++) 
		System.out.print(i + "   ");
	System.out.print("\n");
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board.length * 2 + 1; j++) 
			System.out.print("- ");
		System.out.print("\n");
		System.out.print(letrasTablero[i] + " ");
		for (int j = 0; j < board[i].length; j++) {
			System.out.print("| ");
			if (board[i][j] == null)
				System.out.print("0 ");
			else
				System.out.print(board[i][j] + " ");
		}
		System.out.print("\n");
	}
  }
}
