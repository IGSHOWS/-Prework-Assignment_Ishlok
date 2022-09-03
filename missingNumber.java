import java.util.Scanner;

class missingNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt(); // Initialize array size
		int[] arr = new int[size - 1]; // Declare an array
		for (int i = 0; i < size - 1; i++) // Initialize array
			arr[i] = in.nextInt();
		System.out.println(missingNumber(arr, size));
	}

	static int missingNumber(int array[], int n) {

		int num1 = 0;

		for (int i = 0; i < array.length; i++) {
			num1 = num1 + array[i];
		}

		int last = array.length;

		int num2 = (last * (last + 1)) / 2;

		int result = num2 - num1;

		return num2;
	}

}
