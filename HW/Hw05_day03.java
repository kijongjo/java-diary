package day03;
// scanner ����� ����� ��ġ ��ɾ�
import java.util.Scanner;

public class Hw05 {//class ����
	public static void main(String[] args) {//method ����
		//���
		System.out.println("����?");
		//scanner�� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
		//scanner�� ���� ��ɾ� int���� ����ϰ� �ϴ� ��ɾ�
		int score = sc.nextInt();
		//�ݺ��� ��ø j�� 0���ͽ��� j�� �Է��� score������ �۰ų� ���� j�� 1�� �������Ѷ�
		for (int j = 0; j <= score; j++) {
			//i�� 0���ͽ��� i�� �Էµ� j���� �۰� 1�� �������Ѷ�
			for (int i = 0; i < j; i++) {
				//*���� ��Ȳ�� ���� *�� ���
				System.out.print("*");

			}//���� �ݺ��� ����
			System.out.println();

		}//ū �ݺ��� ����

	}//method ����

}//class ����
