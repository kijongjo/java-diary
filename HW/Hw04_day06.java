package day06;

public class Hw04_day06 {
	public static void main(String[] args) {
		int[][] score = { { 80, 80, 80, 0, 0 }, { 60, 50, 80, 0, 0 }, { 50, 90, 90, 0, 0 }, { 40, 50, 60, 0, 0 },
				{ 90, 90, 95, 0, 0 }, { 85, 95, 100, 0, 0 } };
		int[][] score2 = new int[6][5];
		for (int i = 0; i < score.length; i++) {
      
			score2[i][1] = score[i][0] + score[i][1] + score[i][2];
			System.out.println("ÃÑÁ¡ :" + score2[i][1] + "  " + "Æò±Õ :  " + score2[i][1] / score2.length);
		}

	}
}
