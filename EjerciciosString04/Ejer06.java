import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase, search;
		int count = 0, i = 0, j;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		System.out.print("Introduce un texto que buscar en la frase: ");
		search = sc.nextLine();

		while (i < phrase.length()){
			j = 0;
			while (phrase.charAt(i) == search.charAt(j)){
				if (j+1 == search.length()){
					count++;
					j = 0;
				}
				j++;
				i++;
			}
			i++;
		}

		System.out.println("Se an encotrado "+count);

		sc.close();
	}
}