package day07;
//package 열음
//method 

public class MethodEx4 {//class 열음
	//method 작성 
	static int plus(int x, int y) {
		int c = x+y;
		x++; //<-
		return c;
		
	}
// overloading method 세개 
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
	//각각 데이터 타입이다른 변수 오버로딩	
     int result1 = plus(a, b);
		float result2 = plus(100.0f, 200);
		String result3 = plus("오늘은", "월요일");

	
	System.out.println("result1 :"+result1);
	System.out.println("result2 :"+result2);
	System.out.println("result3 :"+result3);
	}//method 닫음
}//class 닫음
