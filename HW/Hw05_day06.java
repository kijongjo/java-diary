package day06;

import java.util.Scanner;

public class Hw05_day06 {
	public static void main(String[] args) {
//		Hw05. �߱� ���� (BaseBall)
//		3�ڸ��� ���� ���� ���� : 397
//		�ڸ��� ���ڰ� ��� ���� �ϸ� strike
//		�ڸ��� �ٸ����� �ٸ� �ڸ��� ���ڰ� �����ϸ� ��
//
//		�Է�:307
//		��� : 2S
//
//		�Է�:379
//		���: 1S2B
//
//		�Է�:397
//		���: ���� �����մϴ�. 3ȸ���� �����ϼ̽��ϴ�.
//
//		[�˰���]
//		1. ��ǻ�Ͱ� ���ڸ����ڸ� �����Ѵ�.
		int[] com = new int[3];
		int comValue = (int) (Math.random() * 1000);
		System.out.println(comValue);
		com[0] = comValue / 100;
		com[1] = comValue % 100 / 10;
		com[2] = comValue % 10;
		boolean flag = true; // ���� �������� ������ ��� ���� ��.
		int counter = 0;
		while (flag) { // flag=true�̱� ������ ���
			counter++;// while �������� 1�� ������Ű�� ������ .
						// 2. ����ڷκ��� 3�ڸ����ڸ� �Է¹޴´�.
			int[] user = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է��Ͻÿ� : ");
			int score = sc.nextInt();

			user[0] = score / 100;
			user[1] = score % 100 / 10;
			user[2] = score % 10;

//		3. �Ǻ��Ѵ�.
			int strike = 0;
			int ball = 0;

//		(�ڸ��� ���ڰ� ��ġ�ϸ� :strike
//		�ڸ��´ٸ����� ���ڰ���ġ�ϸ� : ball)
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

//		4. ����Ѵ�.
			}
		}
		System.out.println("�����մϴ�." + counter + "���� ����.");

	}

//		5. 3strike�̸� �����Ѵ�.
//		6. �ƴϸ� 2������ ���ư��� �ݺ��Ѵ�.
//	
}
