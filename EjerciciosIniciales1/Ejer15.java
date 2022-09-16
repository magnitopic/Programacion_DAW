import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int science;
		int math;
		int tech;
		int spanish;
		int history;
		int religion;

		System.out.print("Introduce tu nota de ciencias: ");
		science=sc.nextInt();
		System.out.print("Introduce tu nota de matemáticas: ");
		math=sc.nextInt();
		System.out.print("Introduce tu nota de tecnología,: ");
		tech=sc.nextInt();
		System.out.print("Introduce tu nota de lengua: ");
		spanish=sc.nextInt();
		System.out.print("Introduce tu nota de historia: ");
		history=sc.nextInt();
		System.out.print("Introduce tu nota de religión.: ");
		religion=sc.nextInt();

		System.out.println("Tu media de asignaturas de ciencias es de " + (science + math + tech)/3);
		System.out.println("Tu media de asignaturas de letras es de " + (spanish + history + religion)/3);

		sc.close();
	}
}