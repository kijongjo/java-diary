package day05;
import java.util.Scanner;
public class Hw05_day05 {
	public static void main(String[] args) {
 //����ڷκ��� 10���� ���� �����͸� �Է¹޾� �迭�� ��� �л����� ������ ����� ȭ�鿡 ����ϼ��� 
		Scanner sc= new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int score = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score2 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score3 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score4 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score5 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score6 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score7 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score8 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score9 = sc.nextInt();
		System.out.println("������ �Է��ϼ���:");
		int score10 = sc.nextInt();
	
	int[] c = {score,score2,score3,score4,score5,score6,score7,score8,score9,score10};
	int b = 0;
	int d = 0;
	for (int i = 0; i < c.length; i++) {
		b=c[i]+b;
		
	}
	System.out.println("����: "+ b);
	System.out.println("����: "+b/10);

	}
}