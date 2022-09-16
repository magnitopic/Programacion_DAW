import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String name;
		int price;
		
		System.out.print("Introduzca el nombre del producto: ");
		name=sc.nextLine();
		System.out.print("Introduzca el precio del producto: ");
		price=sn.nextInt();
		
		
		System.out.println("El precio de "+name+" con el 21% de IVA es "+ (price+(price*0.21)));
		
		sc.close();
		sn.close();
	}

}
