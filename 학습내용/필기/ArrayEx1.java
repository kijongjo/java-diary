package day04;
//package ����
public class ArrayEx1 {//class ����
	public static void main(String[] args) {//main ����
		int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10; // <- ���� ����

		a1 = 10;
		a2 = 20;
		a3 = 30;
		a4 = 40;
		a5 = 50;
		a6 = 60; // <-����
		a7 = 70;
		a8 = 80;
		a9 = 90;
		a10 = 100;

		for (int i = 1; i <= 10; i++) { // �ݺ���
			// System.out.println(ai); //<-�Ұ���
		}
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5); // <-���
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);

		// ���� �������� �ϳ��� ��������ʰ� �ݺ����� ���� �ֵ��� �ϴ°��� ARRAY�� ��.

		// �迭 :apt ����
		// ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ����
		// �迭����
		// �ڷ���[] ������;
		// �ڷ��� ������[];
		// int[]m; or int m[]

		//array ����
		int[] m;
		//array�� ũ�� ����
		m = new int[3]; // <-intũ���� ���� 3���� ������.
		//m�� �ּ� ���
		System.out.println(m);

		m[0] = 10;
		m[1] = 20;
		m[2] = 30; // <-�ε������ �Ѵ�. apt�� ������ �����ϴ� ��ҵ�
		System.out.println("m[0]" + m[0]);
		System.out.println("m[1]" + m[1]);
		System.out.println("m[2]" + m[2]);
		// �ݺ������ε� ���� �ִ�.
		for (int i = 0; i < 3; i++) {
			m[i] = (i + 1) * 10;
			System.out.println("m[" + i + "]:" + m[i]);
		}

		System.out.println("------------------------------------");
		// int ũ���� �迭 c�� ����
		// 5���� ������ ������ ���� .
		// 5,10,15,20,25 ���� ����
		// �̰��� ȭ�鿡 ���

		//���� c ����
		int[] c;
		//c�� ũ�� 
		c = new int[6]; // <- ��ȣ6�� �ƴ� 6ĭ�� �ִ°��̶� �����Ұ�. �迭�� 0���ͽ����Ѵ�.
		System.out.println(c);// <-������
		c[0] = 5; // <-�� ĭ���� ������ ��������
		c[1] = 10;
		c[2] = 15;
		c[3] = 20;
		c[4] = 25;
		c[5] = 30;
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		System.out.println(c[5]);
		//for �ݺ��� ������ 0���� 6����
		for (int i = 0; i < 6; i++) { // <-���ǿ��� <=�� �ȵȴ�.
										// �迭�� ���̴� �˼� �ִٸ� �ذᰡ��
			c[i] = (i + 1) * 5; // d.length�� ������ ���� �� �ִ�
			System.out.println(c[i]);
		}
		//for �ݺ��� ���� 
		int[] d;
		d = new int[4];
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		d[3] = 4;
		System.out.println(d[1]);

		//for �ݺ��� ����
		for (int i = 0; i < d.length; i++) { // �迭�� ũ��
			//array�� �� 
			d[i] = i;
			System.out.println(d[i]);

		}
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		//int���� ����
		int[] k;
		
		k = new int[7];
		//�ݺ��� ����
		for (int x = 0; x < k.length; x++) {
			k[x] = 2 * (x + 1) - 1;           // <-(i+1)�� ���־�� �뷮 1ĭ�� �� �ȸԴ´� .
			System.out.println(k[x]);
			
			                               // ����� ���� �ٲٱ� �巡���Ŀ� ��Ʈ�� 2 �Ʒ� �ٿ� rename Ŭ���� �ٲٱ�
        
			
	  
		
	
		}//for ����

	}

}
