package day04;

//hw �ΰ� �ֻ����� �������� ���� 4�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ� 
import java.util.Scanner;

public class Hw03_day04 {//CLASS
	public static void main(String[] args) {//METHOD
		//SCANNER ��� ��ɾ�
		Scanner sc = new Scanner(System.in);
		//�հ� ���
		System.out.println("�հ� :");
		//SCANNER ��� ��ɾ�
		int sum = sc.nextInt();
		//�ֻ��� ���
		System.out.println("�ֻ��� ��� :");
		//���� I���� SCANNER ��� ��ɾ�
		int i = sc.nextInt();
		//�ι�° �ֻ��� ��� ���
		System.out.println("�ι�° �ֻ��� ��� :");
		//���� I���� SCANNER ��� ��ɾ�
		int j = sc.nextInt();
	
		
		//FOR�� ��ø�� IF�� ��ø
		//FOR�� I2�� 1���� I���� ���� ������ 
		for ( int i2 = 1; i2 <= i; i2++) { // ���ǽ� �ε�ȣ �����Ұ�.
			//FOR�� J2�� 1���� J���� ���������� 1������
			for (int j2 = 1; j2 <= j; j2++) {
				// I2+J2 SUM�� ���� �ʴٸ�
				if (i2+j2 != sum) {
              //ELSE�� ���
				} else {
					System.out.println("(" + i2 + "," + j2 + ")");

				}//ELSE�� ����

			}//FOR�� ����

		}//FOR�� ����
	}//METHOD ����

}//CLASS ����
