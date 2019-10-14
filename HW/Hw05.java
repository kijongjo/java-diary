package day03;

import java.util.Scanner;

public class Hw05 {
	public static void main(String[] args) {
		System.out.println("ธ๎มู?");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		for (int j = 0; j <= score; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
