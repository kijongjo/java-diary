package day07;
//package ����
public class MethodEx5 {//class ����
	//method ����
	static void resetArray(int[] x) {
		System.out.println(x); // �������� ������ �Ѵ�.
		System.out.println(x[0]);
		//�ݺ��� i��0 ���� 1������ 
		for (int i = 0; i < x.length; i++) {
			//x�迭�� 0����
			x[i] = 0;
		}//for�� ����
	}//method ����

	//main method
	public static void main(String[] args) {
//�迭 ����
     		int[] m = { 100, 200, 300, 400 };
		//for�� i�� 0���� 
     		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}//for�� ����
		System.out.println("-----------------------------------------");
		// �迭�ȿ� ��� ��Ҹ� 0���� �ʱ�ȭ �ϴ� �޼ҵ�.

		System.out.println(m);
		System.out.println(m[0]);// �̰� resetArray(m)���� �ΰ� �Ǹ� m�迭�� ��Ҵ� method�� ���� ������ �ʰ� ��µȴ�.
		// method�� �������� �����Ե�.
		resetArray(m);
		System.out.println(m);
		//for������
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);

		}//for�� ����

	}//main method ����

}//class ����
