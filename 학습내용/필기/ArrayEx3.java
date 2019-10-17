package day05;
//package 열음
public class ArrayEx3 {//class 열음
	public static void main(String[] args) {//method 열음
//1.int a 배열 초기값 10, 50 , 30, 40 , 60 
//2.int b 배열 초기값 20 ,10,  90  120 ,160

//3.int c 배열 5칸짜리
//4. c배열에 a+b 대입 : 30,60,120,160
//5. 출력
        //배열 a 선언
		int[] a = { 10, 50, 30, 40, 60 };
		//배열 b 선언
		int[] b = { 20, 10, 90, 120, 160 };
        //배열 c 선언
		int[] c;
		//c의 공간 선언
		c = new int[5];
       //for문 i는 0부터 c의 길이 까지 1씩 증가시키는 범위값만 실행
		for (int i = 0; i < c.length; i++) {

			c[i] = a[i] + b[i]; // 배열의 요소와 요소들을 또 다른곳에 담을 수 있다. 이런걸 행렬로 만들어 계산해 쓴다.
			System.out.println(c[i]);

		}//for문 닫음

	}//method 닫음
}//class 닫음
