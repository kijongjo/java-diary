package day07;
//package ����
public class MethodEx3 {//class ����
	
	static int getMaxValue(int[]M) {//�迭�� method�����ϴ�
		
		int max = 0;                // method�� ������ ���߱� 
		//for�� �ִ� ǥ���� ����
		for (int i = 0; i < M.length; i++) {
       
			if (max <= M[i]) {
				max = M[i];
  
			}
			 
		
		}
		return max;
	}//for�� ����
//method index ǥ��
static int getMaxValuePosition(int[]M) {//�迭�� method�����ϴ�
		
		int max = 0;                // method�� ������ ���߱� 
		int pos = 0;
		for (int i = 0; i < M.length; i++) {

			if (max <= M[i]) {
				max= M[i];
				pos=i;
  
			}
			 
		
		}
		return pos;
	}//method ����


//�迭�� �ִ밪 ��ġ�� ã��,������ ������ ���� 
//method ���� �����ϱ� 
static void setMaxValue(int[] x ,int value) {//�迭�� method�����ϴ�
int pos =getMaxValuePosition(x);
	x[pos]=value;	

}//method ����
	
//���������� �޼��尡 �����Ҷ� ���� ������� ���� 
//ȣ���� ������ ������ ��ġ�� �ʴ´�.
//�������� �����ϸ�, �������� ���ؼ� ������ ������ �����ϴ�.
//method ȣ�� ��Ŀ� ���� �з� 
//Call by name: getMaxValue(); 
//Call by value : getNumber(4);        <-���� ���� �Ұ�
//Call by refernce:setMaxValue(m,100); <-�ּҰ��� �ָ� ������� ���� �����͸� ���� ������.
//main method
public static void main(String[] args) {
          //m �迭 ����
		int[] m = { 23, 53, 22, 11, 66, 77, 88, 29 };
		int maxValue = getMaxValue(m);
	System.out.println(maxValue);
	
	//method�� position�� ����
	int position = getMaxValuePosition(m);
	System.out.println(position);
	
	//method ��
	setMaxValue(m,-100);
	System.out.println("----------------------------");
	
	//method�� position�� ����
	maxValue = getMaxValue(m);
	System.out.println(maxValue);
	
	
	int position1 = getMaxValuePosition(m);
	System.out.println(position1);

	}//main mathod ����
}//class ����
