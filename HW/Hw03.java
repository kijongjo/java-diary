package day03;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
		System.out.println("�������:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		if (score >= 90) {
			System.out.println("����� ������" + score + " " + "������ A����");
		} else if (score >= 80) {
			System.out.println("����� ������ " + score + " " + "������ B����");
		} else if (score >= 70) {
			System.out.println("����� ������" + score + " " + "������ C����");
		} else if (score >= 60) {
			System.out.println("����� ������" + score + " " + "������ D����");
		}

	}
	

}
