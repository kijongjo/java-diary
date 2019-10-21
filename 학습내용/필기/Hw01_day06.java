package day06;

import java.util.Scanner;

public class Hw01_day06 {

	public static void main(String[] args) {
		int[] a = new int[100];

		nexon: for (int i = 0; i < 100; i++) {

			int randome = (int) (Math.random() * 100);
			a[i] = i;

			Scanner sc = new Scanner(System.in);

			System.out.println("사용자 입력: ");
			int score = sc.nextInt();
			if (a[i] > score) {
				System.out.println("randome값보다 작은수 입니다.");
				continue nexon;

			} else if (a[i] < score) {
				System.out.println("randome값보다 큰수입니다.");
				continue nexon;
			} else if (a[i] == score) {
				System.out.println("수가 일치합니다.");
			}

		}
	}
}
