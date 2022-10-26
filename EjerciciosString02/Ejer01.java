import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  phrase;

		System.out.print("Introduce una frase: ");
		phrase= sc.nextLine();

		

		System.out.println(Arrays.toString(phrase));

		sc.close();
	}
}
