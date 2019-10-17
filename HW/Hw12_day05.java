package day05;

public class Hw12_day05 {
	public static void main(String[] args) {

		int[] rnd = new int[10];

		int x = 0;
		int max = 0;
		int min = 100;
		for (int i = 0; i < rnd.length; i++) {
			int randome = (int) (Math.random() * 100); // <-안에다가 넣어야 랜덤으로 돈다.

			rnd[i] = randome;
			if (max <= rnd[i]) {
				max = rnd[i];
			} else {
			}
			if (min >= rnd[i]) {
				min = rnd[i];
			} else {
			}
			System.out.println(i+"번째  "+rnd[i]);
			System.out.println(i+"번째  "+max + " | " + min);
		}

	}

}
