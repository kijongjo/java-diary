package day06;

import java.util.Scanner;

public class Hw01_day06 {

	public static void main(String[] args) {
		int[] a = new int[100];

		nexon: for (int i = 0; i < 100; i++) {

			int randome = (int) (Math.random() * 100);
			a[i] = i;

			Scanner sc = new Scanner(System.in);

			System.out.println("����� �Է�: ");
			int score = sc.nextInt();
			if (a[i] > score) {
				System.out.println("randome������ ������ �Դϴ�.");
				continue nexon;

			} else if (a[i] < score) {
				System.out.println("randome������ ū���Դϴ�.");
				continue nexon;
			} else if (a[i] == score) {
				System.out.println("���� ��ġ�մϴ�.");
			}

		}
	}
}
