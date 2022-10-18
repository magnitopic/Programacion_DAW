package EjerciciosArrays7;

public class Ejer01 {
	public static void main(String[] args) {
		int[] nums = new int[25];
		System.out.print("Original: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10);
			System.out.print(nums[i] + ", ");
		}

		System.out.print("\nReverse: ");
		for (int i = nums.length - 1; i >= 0; i--)
			System.out.print(nums[i] + ", ");
	}
}
