package day03;
//scanner�� ���� ��ɾ�
import java.util.Scanner;

public class Hw11 {//class ����
	public static void main(String[] args) {//method ����
		//���
		System.out.println("�¾ �⵵");
		//scanner�� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
		//scanner�� ���� ��ɾ�
		int year = sc.nextInt();
		//�������ǵ� year�� ���� 12�� ������ �׸��� �װ��� ������
		year %= 12;
		// ��� ȣ �� �� �� ���� ���߰���
		
		// 4 5 6 7 8 9 101 10 12 3
		//switch case ��year������ ����
		switch (year) {
		//4���
		case 4:
			//�̰� ����϶�
			System.out.println("����� ����Դϴ�.");
		//���⼭ �����
			break;
		case 5:
			System.out.println("����� �Ҷ��Դϴ�.");
			break;
		case 6:
			System.out.println("����� ȣ���Դϴ�.");
			break;
		case 7:
			System.out.println("����� �䳢���Դϴ�.");
			break;
		case 8:
			System.out.println("����� ����Դϴ�.");
			break;
		case 9:
			System.out.println("����� ����Դϴ�.");
			break;
		case 10:
			System.out.println("����� �����Դϴ�.");
			break;
		case 11:
			System.out.println("����� ����Դϴ�.");
			break;
		case 12:
			System.out.println("����� �����̶��Դϴ�.");
			break;
		case 1:
			System.out.println("����� �߶��Դϴ�.");
			break;
		case 2:
			System.out.println("����� �����Դϴ�.");
			break;
		case 3:
			System.out.println("����� �������Դϴ�.");
		
		

		}//switch�� ����

	}//method ����

}//class ����
