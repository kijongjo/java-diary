package day03;

import java.util.Scanner;

public class Hw13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
	  System.out.println("�ܵ� �Ա�:");
	  
	  int M500 = coin/50000;
	  int M100 = coin%50000/10000;
	  int M50  = coin%10000/5000;
	  int M10  = coin%5000/1000;
	  int M5   = coin%1000/500;
	  int M1   = coin%500/100;
	  int M05  = coin%100/50;
	  int M01  = coin%50/10;
	  int M001 = coin%10;
	
        System.out.println("5������:"+M500+"��");
        System.out.println("1������:"+M100+"��");
        System.out.println("5õ����:"+M50+"��");
        System.out.println("1õ����:"+M10+"��");
        System.out.println("5�����:"+M5+"��");
        System.out.println("1�����:"+M1+"��");
        System.out.println("5�ʿ���:"+M05+"��");
        System.out.println("1�ʿ���:"+M01+"��");
        System.out.println("1��:"   +M001+"��");
        // �ܵ���ȯ��(ū ���� ȭ�������)
    // 1. �ܵ��� �Է¹޴´�
    // 2. ȭ�� ��ȯ�Ѵ�. 50000�� 10000�� 5000�� 1000�� 500�� 100 �� 50�� 10 �� 1��
    // 3. ����Ѵ�.
	
	
	}

}
