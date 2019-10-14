package day03;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
		System.out.println("성적출력:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		if (score >= 90) {
			System.out.println("당신의 점수는" + score + " " + "학점은 A학점");
		} else if (score >= 80) {
			System.out.println("당신의 점수는 " + score + " " + "학점은 B학점");
		} else if (score >= 70) {
			System.out.println("당신의 점수는" + score + " " + "학점은 C학점");
		} else if (score >= 60) {
			System.out.println("당신의 점수는" + score + " " + "학점은 D학점");
		}

	}
	

}
