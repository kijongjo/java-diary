package day03;
//scanner�� ���� ��ɾ�
import java.util.Scanner;

public class StatementEx11 {//class ����
	public static void main(String[] args) {//method ����
		//���
		System.out.println("�¾ �⵵ :");
		//scanner�� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
       //scanner�� ���� ��ɾ�
		int year = sc.nextInt();
       //���
		System.out.println("�Է��ѳ⵵:" + year);
       //year�� 12�� ���� ������
		year %= 12;
		// �⵵ 12�� ���� ������??
		// ��� ȣ �� �� �� ���� ���߰���
		// 4 5 6 7 8 9 101 10 12 3
		//���ǹ� 12�� ���� ���� year�� 4�� ������
		if (year == 4) {
			//�̰� ���
			System.out.println("����� ���");
		//���� ������ ���������ʴ´ٸ� 12�γ��� year�� ���� 5��� 
		} else if (year == 5) {
			//�̰� ����϶�
			System.out.println("����� �Ҷ�");
		} else if (year == 6) {
			System.out.println("����� ȣ���̶�");
		} else if (year == 7) {
			System.out.println("����� �䳢��");
		} else if (year == 8) {
			System.out.println("����� ���");
		} else if (year == 9) {
			System.out.println("����� ���");
		} else if (year == 10) {
			System.out.println("����� ����");
		} else if (year == 11) {
			System.out.println("����� ���");
		} else if (year == 12) {
			System.out.println("����� �����̶�");
		} else if (year == 1) {
			System.out.println("����� �߶�");
		} else if (year == 2) {
			System.out.println("����� ����");
		} else if (year == 3) {
			System.out.println("����� ������");
		}// if�� ����

		// �� : 12����
		// �����ι�������̽�������

		// �¾ �⵵ 4�ڸ� ���ڸ� �Է�
		// ��ĳ�ʸ� ����ؼ� ���� 4�ڸ� ���� �Է� ����
		// ȭ�鿡 ���

		// � �������� ���

	}//method ����

}//class ����
