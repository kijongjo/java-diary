package day05;

public class Hw10_day05 {
	public static void main(String[] args) {

		int[] arr = new int[101];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = i;
			if (arr[i] != 7) {
				System.out.println(arr[i]);
			}

		}

	}
}