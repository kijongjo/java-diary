package day03;

public class StatementEx7 {//class ����
	public static void main(String[] args) {//method ����
		/*
		 * int kor=55; int eng=90; int mat=70; //������ ����� ��� System.out.print("����:");
		 * System.out.println(kor+eng+mat); System.out.print("���:");
		 * System.out.println((kor+eng+mat)/3);
		 */
		// ���� ���� 3����
		int kor = 70;
		int eng = 90;
		int mat = 90;

		int total = kor + eng + mat;
		// ��� ���� ���ڿ� ����
		System.out.println("����:" + total);
		// �Ǽ��� Ÿ���� ���� ����
		float avg = total / 3.0f; // <-3.0f�� �ϸ�(folat�����ϱ�) float Ÿ���� �ǰ� ���� float�� ���´�.
		// ��� ��� ���ڿ� ���
		System.out.println("���:" + avg);// int ������ float �ϸ� float�� �� Ŀ�� float���� �ȴ�
		// if�� 4����
		if (avg >= 90) {
			System.out.println("����� ������ A�Դϴ�.");   

		} else if (avg >= 80) {                   //<-�������� ������ �ϴ°�.���� ������ �������� ������ �ϱ� ������ ���� ��Ȯ�� �������� �������� �ʿ䰡����.
			System.out.println("����� ������ B�Դϴ�.");
		} else if (avg >= 70) {
			System.out.println("����� ������ C�Դϴ�.");
		} else if (avg >= 60) {
			System.out.println("����� ������ D�Դϴ�.");
		} else if (avg < 60) {
			System.out.println("����� ������ F�Դϴ�.");
		}

	}//method ����

}//class ����
