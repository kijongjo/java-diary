package day03;
//scanner�� ���� ��ɾ�
import java.util.Scanner;

public class Hw12 {//class����
	public static void main(String[] args) {//method ����
      //���
		System.out.println("�ð��Է�:");
		//scanner�� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
		//scanner�� ���� ��ɾ�
		int time = sc.nextInt();
		//���� day time�� 606024�ΰ��� ������ ������
		int day =time/(60*60*24);
		//���� hour ���� day�� 24�� ���϶�
		int Hour= day*24;
		//���� minutes ���� hour�� 60�� ���϶�
		int minutes= Hour*60;
		//���� seconds ���� minutes�� 60�� ���϶�
		int seconds=minutes*60;
		//printf ���� ���Ǵ�� ����϶� %d ������ ���
		System.out.printf("������ %d�� %d�ð� %d �� %d�� �Դϴ�.",day,Hour,minutes,seconds);
		//int second = time;
		//int minute = second/60;
		//int Hour
	 
	
	}//method ����
}//class ����