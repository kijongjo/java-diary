package day05;

import java.util.Scanner;

public class Hw08_day05 {
	public static void main(String[] args) {
		// 정수 10개를 입력받아 배열에 저장하고 배열에 있는 정수 중에서 3의 배수만 출력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력:");
		int inte1 = sc.nextInt();
		System.out.println("정수입력:");
		int inte2 = sc.nextInt();
		System.out.println("정수입력:");
		int inte3 = sc.nextInt();
		System.out.println("정수입력:");
		int inte4 = sc.nextInt();
		System.out.println("정수입력:");
		int inte5 = sc.nextInt();
		System.out.println("정수입력:");
		int inte6 = sc.nextInt();
		System.out.println("정수입력:");
		int inte7 = sc.nextInt();
		System.out.println("정수입력:");
		int inte8 = sc.nextInt();
		System.out.println("정수입력:");
		int inte9 = sc.nextInt();
		System.out.println("정수입력:");
		int inte10 = sc.nextInt();
		int[] c = { inte1, inte2, inte3, inte4, inte5, inte6, inte7, inte8, inte9, inte10 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 3 == 0) {
				System.out.println(c[i]);
			}
		}

	}
}
