package day05;
//package ����
public class Hw01_day05 {//class ����
	public static void main(String[] args) {//method ����
        //2����� �迭 ���� m
		int[][] m;
		// 5�� 3�� ������ ũ�� ���� 5ĭ ���� 3ĭ
		m = new int[5][3];          //new int[5][3] ũ���. // m[i][j]�� ���� ��ȣ�̴� .
		//counter 
		int counter = 9;
		//for�� i�� 0���� ���� ���� ���� ���� i�� 1�� ����
		for (int i = 0; i < m.length; i++) {
			//for�� i�� 0���� ���� ���� ����
			for (int j = 0; j < m[0].length; j++) {
				//counter�� 1������
				counter++;
				//m[i][j]�� counter ����
				m[i][j] = counter;
				System.out.println(m[i][j]);
			}//for�� ����

		}//for�� ����

	}//method ����

}//class ����.

