package EjerciciosArrays3;

public class Ejer02 {

	public static void main(String[] args) {
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		int[] nums3 = new int[5];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
			nums3[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < nums1.length; i++) {
			if ((nums1[i] != nums2[i]) && (nums2[i] != nums3[i])) {
				System.out.println("Los tres arrays no son iguales");
				return;
			}
		}
		System.out.println("Los tres arrays son iguales");
	}

}
