package day05;

public class Hw07_day05 {
	public static void main(String[] args) {
		// hw06���� 3�� ����� 3333 5�� ����� 5555 3�� 5�� ������� 3535�� �����ϼ���
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
