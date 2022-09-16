import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int b;
		int h;
		
		System.out.print("Introduce la base del trinagulo: ");
		b=sn.nextInt();
		System.out.print("Introduce la altura del triangulo: ");
		h=sn.nextInt();
		
		System.out.println("Su area es de " + (b*h)/2);
		sn.close();
	}

}
