package day05;
//package ����
//char �迭�� �����ϰ�
//�� �迭�� java world ��� ���ڸ� ������ 
// �ݺ����� ����ؼ� ��� : java world
public class ArrayEx4 {//class ����
	public static void main(String[] args) {//method ����
		//���� �ڷ��� ����
		char[] b = { 'j', 'a', 'v', 'a', ' ', 'w', 'o', 'r', 'l', 'd' };
		// �� ���� �ڷ��� ����
		String[] a = { "JAVA WORLD" };

		
		
		//�Ųٷ� ǥ���ϱ�
		//for�� i�� b�� ���̿��� 1�� �� ���������� i�� 0���� ũ�ų� ���� ������ 1�� �����Ҷ� ������ ���� ���� ����
		for (int i = b.length-1; i>=0;i--) {   //������ �����ؾ� �ݺ��Ѵ�. 
			System.out.print(b[i]);

		}//for�� ����
		System.out.println();
		System.out.println(a[0]);
	
//���ڸ� �������� ���
	
	}//method ����

}//class ����
