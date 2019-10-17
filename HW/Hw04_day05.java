package day05;

public class Hw04_day05 {
	public static void main(String[] args) {
		int counter = 0;
		int[][] c = new int[5][5];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				counter++;
				c[i][j] = counter;
				System.out.print(c[i][j]);
			}
			System.out.println();

		}

	}

}
