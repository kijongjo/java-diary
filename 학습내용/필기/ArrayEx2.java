package day05;
//package 선언
//배열 : 같은 타입의 데이터를 하나의 이름으로 묶어서 처리해주는 기능 

//참조형 변수(reference type)에 해당된다.
//인덱스의 번호는 0번 부터
//배열의 인덱스를 사용해서 배열의 각 요소에 접근
//배열과 일반 변수와의 구분
//배열을 선언만 하면 메모리에 생성은 되지만 값을 담을 수 있는 요소가 만들어지지 않는다.
//new 연산자에 의해서  공간이 만들어진다.
public class ArrayEx2 {//class 열음
	public static void main(String[] args) {//method 열음
		//배열 선언
		int c[];
		// 공간 선언
		c = new int[5];
		//각각의 값 대입
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		c[3] = 40;
		c[4] = 50;
         
		//length 출력
		System.out.println(c.length);
		System.out.println("배열의 요소 0 의 값 : " + c[0]);

		//배열 선언
		int[] a;
		// 공간 선언
		a = new int[4];

		//반복문 z는 0부터 배열의 길이 전까지면 실행하라
		for (int z = 0; z < a.length; z++) {
			a[z] = z * 10;
			System.out.println(a[z]);

		}//for문 닫음
        // 규칙성이 없는 경우 
		//d라는 정수형 배열을 선언
		//int 크기의 3칸 짜리 배열 
		//  29 16 68 값을 대입 
		// 화면에 출력 
		//규칙성이 없는 경우엔배열을 선언하면서 초기값 설정 할수 있다. 공간 선언 new연산자는 안써도 된다.
		//배열 d 선언 및 대입
		int[]d = {29,16,68}; 
		
		 //출력   
		System.out.println(d[0]+"  "+d[1]+"  "+d[2]);
		
		//for문 i는 0부터 d의 길이까지 1씩 증가시키되 그안에 있는 범주만 계산하라 
		for (int i = 0; i < d.length; i++) {
			System.out.println("d["+i+"]:" +d[i]);
		}//for문 닫음
		
		
	}//method 닫음

}//class 닫음
