package day07;
//package 열음
public class MethodEx5 {//class 열음
	//method 열음
	static void resetArray(int[] x) {
		System.out.println(x); // 참조값을 가지게 한다.
		System.out.println(x[0]);
		//반복문 i는0 부터 1씩증가 
		for (int i = 0; i < x.length; i++) {
			//x배열에 0대입
			x[i] = 0;
		}//for문 닫음
	}//method 닫음

	//main method
	public static void main(String[] args) {
//배열 선언
     		int[] m = { 100, 200, 300, 400 };
		//for문 i는 0부터 
     		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}//for문 닫음
		System.out.println("-----------------------------------------");
		// 배열안에 모든 요소를 0으로 초기화 하는 메소드.

		System.out.println(m);
		System.out.println(m[0]);// 이걸 resetArray(m)위로 두게 되면 m배열의 요소는 method에 의해 변하지 않고 출력된다.
		// method가 참조값을 가지게됨.
		resetArray(m);
		System.out.println(m);
		//for문열음
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);

		}//for문 닫음

	}//main method 닫음

}//class 닫음
