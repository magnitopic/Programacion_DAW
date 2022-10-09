package EjerciciosArrays2;

public class Ejer10 {
	public static void main(String[] args) {
		int[] nums1 = new int[10];
		int[] nums2 = new int[10];
		for (int i = 0; i < 10; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
		}

		boolean flag = true;
		for (int i = 0; i < 10; i++) {
			if (nums1[i] != nums2[i])
				flag = false;
		}
		if (flag)
			System.out.println("Los arrays son iguales");
		else
			System.out.println("Los arrays no son iguales");
	}
}
