package day04;
//package ����
import java.util.Scanner;
// scanner ����� ���� ��ɾ�
//���Ǳ� �����  
public class VendingMachine {//class����

	public static void main(String[] args) {//main ��ɾ� ����
		//�������Ǳ� ���
		System.out.println("    ----���� ���Ǳ�----");
		// TODO Auto-generated method stub
		//��ī�ݶ� 2500 ��� �������� ���� ��� ���
		System.out.println("-- 1.��ī�ݶ�    : 2500 �� --");
		System.out.println("-- 2.���̴�       : 1800 �� --");
		System.out.println("-- 3.ȯŸ          : 2200 �� --");
		System.out.println("-- 4.�׶�          : 4000 �� --");
		System.out.println("-- 4.����          : 3500 �� --");
		System.out.println("------------------------");
        //���� �־��ּ��� ��� ����� �Է��� ���ϵ��� 
		System.out.println("���� �־��ּ��� :");
		//����� �Է��� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
		//����� �Է��� ���� ��ɾ�2
		int money = sc.nextInt();
		// ����ڰ� �Է��� ���� �����
		System.out.println("money :" + money);
		//���� ����ϴ� ���� ������ ���ἱ�ö� ���
		System.out.println("���Ḧ ������ �ּ���:");
		// ����� �������ġ ����� ���� ��ɾ�
		int choice = sc.nextInt();
		//����ڰ� �Է��� ���� ���
		System.out.println("������ ����:" + choice);
		//������ ������
		System.out.println("������ ������ �ּ���:");
		// ����ڰ� �������ġ�� ���� ��ɾ�
		int cnt = sc.nextInt();
		//���� ���� �˸��� ���� ���
		System.out.println(cnt + "���� �����ϼ̽��ϴ�.");

		//���� ����
		int price = 0;  // �׳� �ʱ�ȭ ���ذ��̴�. 
		//���ǹ� ���� choice�� 1�̶��
		if (choice == 1)
			//������ 2500 ����
			price = 2500;
		//�׷��� �ʴٸ� choice�� 2���
		else if (choice == 2)
			//������ 1800����
			price = 1800;
		//�׷��� �ʴٸ� choice�� 3�̶��
		else if (choice == 3)
			//������ 2200����
			price = 2200;
		//�׷��� �ʴٸ� choice�� 4���
		else if (choice == 4)
			//price 4000����
			price = 4000;
		//�׷��� �ʴٸ� choice�� 5���
		else if (choice == 5)
			//price 3500����
			price = 3500;
		// ���� �����Ϸ����ϴ� ��ǰ�� ����
		//���� exprice�� price�� cnt�� ��
		int exPrice = price * cnt; // 2500*2==>5000
		//���
		System.out.println("��ǰ����:" + price);
		System.out.println("���� ��ǰ����:" + exPrice);
		// ���� ��ǰ ���ݰ� , money ���ؼ�
		
		//���Ǳ�  �Է��� money�� ���� 50000�� �������
		int M500  = money / 50000;
		// 50000�� ���� ������ ���� 10000�� �������
		int M100  = money % 50000 / 10000;
		// 10000�� ���� ���������� 5000�� �������
		int M50   = money % 10000 / 5000;
		// 5000�� ���� ���������� 1000�� �������
		int M10   = money % 5000 / 1000;
		// 1000�� ���������� ���� 500�� �������
		int M5    = money % 1000 / 500;
		// 500�� ���� ������ ���� 100�� �������
		int M1    = money % 500 / 100;
		//100�� ���� ������ ���� 10�� �������
		int M01   = money % 100 / 10;
		//10�� ���� ��������
		int M001  = money % 10;
		//���ǹ� ���� money�� ���� exprce���� Ŭ��쿡
		if (money > exPrice) { // if �ȿ� IF���� �ǵ��� �ִ�.
			// money > ���� ��ǰ ����
			// ��ǰ �Ǹ�
			//money���� exprice������ ����϶� 
			money -= exPrice;
			// ���� ��� ���� ����϶�
			System.out.println(choice + "�� ��ǰ" + cnt + "��" + "�ܾ���:" + (money));
             // money-=exprice���� ���� M500�������� ����϶�
			System.out.println("5������:" + M500 + "��");
             // money-=exprice���� ���� M100�������� ����϶�
			System.out.println("1������:" + M100 + "��");
			//money-=exprice���� ���� M50�������� ����϶�
			System.out.println("5õ����:" + M50 + "��");
			//money-=exprice���� ���� M10�������� ����϶�
			System.out.println("1õ����:" + M10 + "��");
			//money-=exprice���� ���� M5�������� ����϶�
			System.out.println("5�����:" + M5 + "��");
			//money-=exprice���� ���� M1�������� ����϶�
			System.out.println("1�����:" + M1 + "��");
			//money-=exprice���� ���� M01 �������� ����϶�
			System.out.println("1�ʿ���:" + M01 + "��");
			//money-=exprice���� ���� M001�������� ����϶�
			System.out.println("1��:" + M001 + "��");
          //�׷��������� 3���� ���� ����϶� 
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println("�ٽ� ������ �ֽʽÿ�");
			//MONEY�� �״�� ����϶�
			System.out.println("��ȯ��: " + money);
		}//ELSE�� ����

		// money <���� ��ǰ���� : �ܾ��� �����մϴ�.

	}//METHOD ����

}//CLASS����
