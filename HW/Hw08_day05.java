package day05;

import java.util.Scanner;

public class Hw08_day05 {
	public static void main(String[] args) {
		// ���� 10���� �Է¹޾� �迭�� �����ϰ� �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�:");
		int inte1 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte2 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte3 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte4 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte5 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte6 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte7 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte8 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte9 = sc.nextInt();
		System.out.println("�����Է�:");
		int inte10 = sc.nextInt();
		int[] c = { inte1, inte2, inte3, inte4, inte5, inte6, inte7, inte8, inte9, inte10 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 3 == 0) {
				System.out.println(c[i]);
			}
		}

	}
}
