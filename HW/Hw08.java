package day03;

public class Hw08 {// class ����
	public static void main(String[] args) {// method ����
		// �ݺ��� ��ø i�� 2���ͽ��� i�� 9���� �۰ų� ���� i�� 1�� ����
		for (int i = 2; i <= 9; i++) {
			// j�� 1���ͽ��� j�� 9���� �۰ų� ���� 1�� ����
			for (int j = 1; j <= 9; j++) {
				// ��� i*j=i*j
				System.out.print(i + "*" + j + "=" + i * j + "\t"); // <- ��ĭ �ٶ� ����ϴ°�

			}//�����ݺ�������
			//��� ����
			System.out.println();
		}//ū �ݺ��� ����
	}//method����
}//class ����
