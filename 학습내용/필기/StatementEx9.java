package day03;
//scanner �� ���� ��ɾ�
import java.util.Scanner;

//switch case��
public class StatementEx9 {//class ����
	public static void main(String[] args) {//method ����
		System.out.println("�����Է�:");
		//scanner�� ���� ��ɾ�
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // ���� �о���°��� next
        //if else�ε� ���� �� ����.
		
		switch (score) { // <- switch(�Է°�[����ġ]){���ǿ����� �����}
		case 100:// case 10: // <- ��� �����ϴ� ���� �������� break ��ɾ� ��� 
			//��ɾ��� �Ʒ� ��¹����� 99�� ������ case10�� �Է��ص� �ȴ�.
			System.out.println("A����"); // 99�Է��ϸ� CASE99�� ���� A���� �̰� �� ������ ��� �����ϰ� �ȴ�. ����� �����Է� 99 A���� B����
			break; // <- ��� �����ϴ� ���� �������� break ��ɾ� ���
		case 99://  case 9:
			System.out.println("A����"); // <-������ �����̳Ŀ� ���� ���� �ٸ��� �ϴ°�
			break;
		case 80:// case8:
			System.out.println("B����"); // ������ 98���� �ȳ��´� �� ����ġ���� ������ �� case�� �´� �͸� ���´�.
			break;                      // �̸����� score�� /10�� �ϰԵǸ� ���� 9 ,10 8 ���� �Ǵµ� �̸� �̿��� ������ ������ ���ִ�.
			                           // 93/10 �� java���� ��Ʈ������ ����̱� ������ 9�̴�.
		
		default:
			System.out.println("F����"); // case�̿��� �͵��� default ������ ���� �������� ���ִ�.
		   break;
		
		}//switch case �� ����

		/*
		 * ��� -�ݺ���, ���Ǻб⹮ :if switch case��
		 * 
		 * 
		 * 
		 * 
		 * 1. ����ڷκ��� ������ �Է¹޴´�. Scanner sc=new Scanner(System.in);
		 * 
		 * 
		 * 2. ������ ���� ������ ����Ѵ�.
		 */
	}//method ����
}//class ����
