package day07;
//package ����
//method 

public class MethodEx4 {//class ����
	//method �ۼ� 
	static int plus(int x, int y) {
		int c = x+y;
		x++; //<-
		return c;
		
	}
// overloading method ���� 
	static float plus(float y, int z) {
		return y + (float) z;
	}

	static String plus(String x, String y) {
		return x + y;
	}

	//main method 
	public static void main(String[] args) {
     int a = 100;
     int b = 200;
	//���� ������ Ÿ���̴ٸ� ���� �����ε�	
     int result1 = plus(a, b);
		float result2 = plus(100.0f, 200);
		String result3 = plus("������", "������");

	
	System.out.println("result1 :"+result1);
	System.out.println("result2 :"+result2);
	System.out.println("result3 :"+result3);
	}//method ����
}//class ����
