package day05;
//package����
//2���� �迭�� �ʱ�ȭ 
public class ArrayEx6 {//class ����
	public static void main(String[] args) {//method ����
        //�迭�� �ʱ�ȭ 4�� 3��
		int[][] m = { { 0, 0, 0 },      //<-4�� 3��
				      { 0, 1, 2 , 1, 2, 3, 5 }, 
				      { 0, 2, 4 ,3,2 }, 
				      { 0, 3, 6 } 
				      };
        //for���� ��ø i�� 0���� ���� ���̱��� 1�� ������Ű�� ����
		for (int i = 0; i < m.length; i++) {
			//for���� ��ø j�� 0���� ���� ���̱��� 1�� ������Ű�� ����
			for (int j = 0; j < m[i].length; j++) { 
				System.out.print(m[i][j]);
				
			}//for�� ����
		  System.out.println();
		}//for�� ����
		
		
	}//method ����

}//class ����
