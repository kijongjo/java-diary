package day04;
//PACKAGE ����

//SCANNER����� ���� ��ɾ�
import java.util.Scanner;

public class Hw01_day04 {//CLASS ����
	public static void main(String[] args) {//MAIN METHOD ����
		//SCANNER ��ɾ� 
		Scanner sc = new Scanner(System.in);
		//�Է� ���
		System.out.println("�Է�:");
		// SCANNER ��ɾ�
		int number = sc.nextInt();
        // ���ǹ� NUMBER�� 3�� ���� �������� 0�� ���ٸ� �Ʒ��� ���� ����϶�
		if (number % 3 == 0) {
			System.out.println(number + "�� 3�� ����Դϴ�.");
		//�׷��� ������ �Ʒ����� ����϶� 
		} else {
			System.out.println(number + "�� 3�� ����� �ƴմϴ�.");

			// ����ڷκ��� �Է¹��� ���� 3�� ������� �ƴ��� ���

		}// ELSE ����

	}//METHOD ����
}// CLASS ����
