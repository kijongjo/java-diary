package day05;

//pakage ����
public class Hw02_day06 {// class ����
	public static void main(String[] args) {// method ����
		// �迭 ���� ũ��� �� 4 �� 3
		int[][] m = new int[4][3];
		// for�� ��ø i�� 0���� ���� ���� ������ i�� 1�� ������Ų��.
		for (int i = 0; i < m.length; i++) { // <-1��
			// for�� ��ø j�� 0���� ���� ���� ������ j�� 1�� ������Ų��.
			for (int j = 0; j < m[0].length; j++) { // <-2��
               //m �迭�� i*j
				m[i][j] = i * j;
				
				//reference type�� ���� 32bit�̴�. �ֳ��ϸ� �������� ������ �����̴�. 
				
				System.out.println("m[" + i + "][" + j + "]:" + m[i][j]);
			}//for�� ����

		}//for�� ����

	}//method ����

}//class ����
