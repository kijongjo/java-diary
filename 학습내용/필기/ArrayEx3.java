package day05;
//package ����
public class ArrayEx3 {//class ����
	public static void main(String[] args) {//method ����
//1.int a �迭 �ʱⰪ 10, 50 , 30, 40 , 60 
//2.int b �迭 �ʱⰪ 20 ,10,  90  120 ,160

//3.int c �迭 5ĭ¥��
//4. c�迭�� a+b ���� : 30,60,120,160
//5. ���
        //�迭 a ����
		int[] a = { 10, 50, 30, 40, 60 };
		//�迭 b ����
		int[] b = { 20, 10, 90, 120, 160 };
        //�迭 c ����
		int[] c;
		//c�� ���� ����
		c = new int[5];
       //for�� i�� 0���� c�� ���� ���� 1�� ������Ű�� �������� ����
		for (int i = 0; i < c.length; i++) {

			c[i] = a[i] + b[i]; // �迭�� ��ҿ� ��ҵ��� �� �ٸ����� ���� �� �ִ�. �̷��� ��ķ� ����� ����� ����.
			System.out.println(c[i]);

		}//for�� ����

	}//method ����
}//class ����
