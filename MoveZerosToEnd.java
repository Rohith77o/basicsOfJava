import java.util.Scanner;

public class MoveZerosToEnd {
	public static void main(String[] args) {

		int[] arr = {1, 3, 4, 5, 0, 6, 7, 9, 0, 5, 0, 3};

		moveZerosToEnd(arr);


		System.out.println("Array after moving zeros to the end:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}


	public static void moveZerosToEnd(int[] arr) {
		int nonZeroIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}


		while (nonZeroIndex < arr.length) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
	}
}
