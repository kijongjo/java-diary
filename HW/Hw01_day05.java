package day05;
//package 열음
public class Hw01_day05 {//class 열음
	public static void main(String[] args) {//method 열음
        //2차우너 배열 선언 m
		int[][] m;
		// 5와 3은 공간의 크기 행은 5칸 열은 3칸
		m = new int[5][3];          //new int[5][3] 크기다. // m[i][j]는 방의 번호이다 .
		//counter 
		int counter = 9;
		//for문 i는 0부터 행의 길이 이하 까지 i는 1씩 증가
		for (int i = 0; i < m.length; i++) {
			//for문 i는 0부터 열의 길이 이하
			for (int j = 0; j < m[0].length; j++) {
				//counter는 1씩증가
				counter++;
				//m[i][j]에 counter 대입
				m[i][j] = counter;
				System.out.println(m[i][j]);
			}//for문 닫음

		}//for문 닫음

	}//method 닫음

}//class 닫음.

