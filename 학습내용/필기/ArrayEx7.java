package day05;

//package ����
//�־��� ���� randome�ϰ� �̱�
public class ArrayEx7 {// class ����
	public static void main(String[] args) {// method ����
		// �迭 �����ϱ�
		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30 };
		// 0<=num
		// random ����� ������ ����
		for (int j = 1; j < 10; j++) {

			int num2 = (int) (Math.random() * 30); // ����ȯ�� ���־�� �Ҽ��� �ȳ����°��� �����϶�
			int num = (int) (Math.random() * 30);
			// for�� i�� 0���� 1�� ���ϱ����� ������ �����ϰ� ����

			System.out.println("rnd[num]: " + rnd[num] + "rnd[num]: " + rnd[num2]);

		
			int temp = rnd[num];
			rnd[num] = rnd[num2];
			rnd[num2] = temp;
			System.out.println(rnd[num] + " " + rnd[num2]);
		} // for�� ����
		for (int i = 0; i < 6; i++) {
			System.out.println(rnd[i] + "\t");
		}
		System.out.println();
	}//method ����

}//class ����
