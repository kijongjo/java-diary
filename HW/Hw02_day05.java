package day05;

//pakage 열음
public class Hw02_day06 {// class 열음
	public static void main(String[] args) {// method 열음
		// 배열 선언 크기는 행 4 열 3
		int[][] m = new int[4][3];
		// for문 중첩 i는 0부터 행의 길이 전까지 i는 1씩 증가시킨다.
		for (int i = 0; i < m.length; i++) { // <-1답
			// for문 중첩 j는 0부터 열의 길이 전까지 j는 1씩 증가시킨다.
			for (int j = 0; j < m[0].length; j++) { // <-2답
               //m 배열은 i*j
				m[i][j] = i * j;
				
				//reference type은 전부 32bit이다. 왜냐하면 참조값만 가지기 때문이다. 
				
				System.out.println("m[" + i + "][" + j + "]:" + m[i][j]);
			}//for문 닫음

		}//for문 닫음

	}//method 닫음

}//class 닫음
