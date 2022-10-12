package EjerciciosArrays4;

public class Ejer06 {
	public static void main(String[] args) {
		int[] veces = new int[6];
		int[] nums = new int[1000];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 6)) + 1;
			veces[nums[i] - 1]++;
		}
		for (int i = 0; i < veces.length; i++)
			System.out.println((i + 1) +": "+ veces[i]);
	}
}
