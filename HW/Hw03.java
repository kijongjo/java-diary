package day03;
//scanner ��ɾ�
import java.util.Scanner;

public class Hw03 {//class ����
	public static void main(String[] args){//method ����
		//���
		System.out.println("�������:");
		//scanner ��ġ�� ���� ��ɾ�
		Scanner scan = new Scanner(System.in);
		//scanner ���� int�� ��°����ϰ� �ϴ� ��ɾ�
		int score = scan.nextInt();
        //���ǹ� score�� 90�̻��̶��
		if (score >= 90) {
			//�̰����
			System.out.println("����� ������" + score + " " + "������ A����");
		//80�̻�
		} else if (score >= 80) {
			System.out.println("����� ������ " + score + " " + "������ B����");
		//70�̻�
		} else if (score >= 70) {
			System.out.println("����� ������" + score + " " + "������ C����");
		//60�̻�
		} else if (score >= 60) {
			System.out.println("����� ������" + score + " " + "������ D����");
		}//���ǹ�����

	}//method ����
	

}//class����
