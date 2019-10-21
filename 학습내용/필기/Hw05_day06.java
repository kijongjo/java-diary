package day06;

import java.util.Scanner;

public class Hw05_day06 {
	public static void main(String[] args) {
//		Hw05. 야구 게임 (BaseBall)
//		3자리의 숫자 랜덤 생성 : 397
//		자리와 숫자가 모두 동일 하면 strike
//		자리는 다르지만 다른 자리에 숫자가 존재하면 볼
//
//		입력:307
//		출력 : 2S
//
//		입력:379
//		출력: 1S2B
//
//		입력:397
//		출력: 정답 축하합니다. 3회만에 성공하셨습니다.
//
//		[알고리즘]
//		1. 컴퓨터가 세자리숫자를 생성한다.
		int[] com = new int[3];
		int comValue = (int) (Math.random() * 1000);
		System.out.println(comValue);
		com[0] = comValue / 100;
		com[1] = comValue % 100 / 10;
		com[2] = comValue % 10;
		boolean flag = true; // 진실 거짓위해 변수로 사용 많이 함.
		int counter = 0;
		while (flag) { // flag=true이기 때문에 계속
			counter++;// while 들어갈때마다 1씩 증가시키는 것으로 .
						// 2. 사용자로부터 3자리숫자를 입력받는다.
			int[] user = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("값을 입력하시오 : ");
			int score = sc.nextInt();

			user[0] = score / 100;
			user[1] = score % 100 / 10;
			user[2] = score % 10;

//		3. 판별한다.
			int strike = 0;
			int ball = 0;

//		(자리와 숫자가 일치하면 :strike
//		자리는다르지만 숫자가일치하면 : ball)
			for (int i = 0; i < user.length; i++) {
				if (com[i] == user[i])
					strike++;
				else {
					for (int j = 0; j < user.length; j++) {
						if (com[j] == user[i]) {
							ball++;

						}
					}
				}
			}
			/*
			 * for (int i = 0; i < com.length; i++) { com[i] = (int) (Math.random() * 10);
			 * for (int j = 0; j < user.length; j++) { if (com[j] == com[i]) i--; } }
			 */

			System.out.println(strike + "S" + " " + ball + "B");
			if (strike == 3) {
				flag = false;

//		4. 출력한다.
			}
		}
		System.out.println("축하합니다." + counter + "만에 성공.");

	}

//		5. 3strike이면 종료한다.
//		6. 아니면 2번으로 돌아가서 반복한다.
//	
}
