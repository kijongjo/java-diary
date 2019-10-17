package day05;

//두행렬에 대한 덧셈을 구하세요 
public class Hw03_day05 {
	public static void main(String[] args) {

		int[][] m = { { 3, 2, 3 }, 
				      { 4, 5, 6 }, 
				      { 1, 4, 9 } };
		int[][] b = { { 1, 8, 7 }, 
				      { 6, 4, 4 }, 
				      { 3, 2, 3 } };
		int[][] c = new int[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = m[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}

}
