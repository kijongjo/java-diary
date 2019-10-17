package day05;
//package 열음
//char 배열을 선언하고
//이 배열에 java world 라는 글자를 담은후 
// 반복문을 사용해서 출력 : java world
public class ArrayEx4 {//class 열음
	public static void main(String[] args) {//method 열음
		//문자 자료형 선언
		char[] b = { 'j', 'a', 'v', 'a', ' ', 'w', 'o', 'r', 'l', 'd' };
		// 긴 문자 자료형 선언
		String[] a = { "JAVA WORLD" };

		
		
		//거꾸로 표현하기
		//for문 i는 b의 길이에서 1을 뺀 값에서부터 i는 0보다 크거나 같을 때까지 1씩 감소할때 범위가 맞을 때만 실행
		for (int i = b.length-1; i>=0;i--) {   //조건을 만족해야 반복한다. 
			System.out.print(b[i]);

		}//for문 닫음
		System.out.println();
		System.out.println(a[0]);
	
//글자를 역순으로 출력
	
	}//method 닫음

}//class 닫음
