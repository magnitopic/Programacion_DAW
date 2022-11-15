package Examen2;

public class programa6 {
	public static void main(String[] args) {
		int[] listaNums = new int[24];
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < listaNums.length; i++) {
			listaNums[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < listaNums.length; i++) {
			for (int j = 0; j < listaNums[i]; j++) {
				System.out.print(abecedario.charAt(i));
			}
			System.out.print("\n");
		}
	}
}