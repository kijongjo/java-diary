package day05;
//package ����
public class ArrayEx5 {//class ����
	public static void main(String[] args) {//method ����
		//m�� �迭 ���� ũ��� 3�� 2��
		int[][] m = new int[3][2];
		System.out.println(m); // m�� length�� 3�̴� ã�ư� ��
		//m[0] ������ ���
		System.out.println(m[0]); // <-���⵵ �������� �������մ�.
		//m[0][0]�� �� ���
		System.out.println(m[0][0]);
		// m.length = m�� ã�ư��� �� �ִ� ĭ��
		// m[0].length =m[]0�� ã�ư��� �� �ִ� ĭ��
       System.out.println("--------------------------");
		//���� counter ����
       int counter= 0;
       //for�� ��ø i�� 0���� ���̴� ���� ���� ���Ϸ� ����϶�
       for (int i = 0; i < m[0].length; i++) {
			//j�� 0���� j�� ���� ���� ���Ϸ� ����϶�
    	   for (int j = 0; j < m.length; j++) {
       
    		   //counter ������ 1�� �������Ѷ�
    		   counter++;
				//counter�� m[j][i]�� �����϶�
    		   m[j][i]= counter;
				System.out.println("["+j+"]"+"["+i+"]"+m[j][i])
				;
			}//for�� �����ʹ���

		}//for�� ū�� ���� 
	}//method ����
}//class ����
