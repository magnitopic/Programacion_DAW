import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Introduce el primer numero: ");
		num1=sn.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2=sn.nextInt();
		
		
		System.out.println(Math.pow(num1, num2));
		sn.close();
	}
	
}
