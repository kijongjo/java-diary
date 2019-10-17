package day05;

public class Hw07_day05 {
	public static void main(String[] args) {
		// hw06에서 3의 배수는 3333 5의 배수는 5555 3과 5의 공배수는 3535를 대입하세요
		int[] c = new int[101];

		for (int i = 0; i < c.length; i++) {
			c[i] = i;
			if (c[i] % 3 == 0) {
				System.out.println("3333");

			} else if (c[i] % 5 == 0) {
				System.out.println("5555");

			} else if (c[i] % 15 == 0) {
				System.out.println("3535");

			} else {
				System.out.println(c[i]);
			}

		}
	}

}
