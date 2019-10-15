package day03;

public class Hw06 {//class 시작
	public static void main(String[] args) {//method 시작
		// HW06.구구단 출력
		//반복문 중첩 i는 1부터시작 i는 9보다 작거나 같고 1씩증가
		for (int i = 1; i <= 9; i++) {
			//j는 1부터 시작 j는 9보다 작거나 같고 1씩증가
			for (int j = 1; j <= 9; j++) {
				//i*j=i*j
				System.out.println(i + "*" + j + "=" + i * j);
			}//작은 반복문 닫음

		}//큰 반복문 닫음
	
	   
	
	
	}//method 닫음

}//class 닫음
