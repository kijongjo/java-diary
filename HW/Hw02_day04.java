package day04;
//PACKAGE ����
public class Hw02_day04 {//CLASS ����
	//MAIN METHOD 
	public static void main(String[] args) {
		//SUM ����
		int sum = 0;
		//FOR�� I�� 0���� 100����
		for (int i = 0; i <= 100; i++) {
			//���ǹ� I�� 2�� ������������ 0�� ���� �ʰ� 3���� ���� �������� 0�� ���� �ʴٸ�
			if (i % 2 != 0 && i % 3 != 0) { // if���� �������� else�� ����°� ���� .
				// SUM�� +=I�� �϶� 
				sum += i;
            //ELSE��
			} else {

			}//ELSE�� ����

		}//FOR�� ����
		System.out.println(sum);
	}//METHOD ����
	

}//CLASS
