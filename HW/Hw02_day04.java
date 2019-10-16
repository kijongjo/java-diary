package day04;
//PACKAGE 열음
public class Hw02_day04 {//CLASS 열음
	//MAIN METHOD 
	public static void main(String[] args) {
		//SUM 변수
		int sum = 0;
		//FOR문 I는 0부터 100까지
		for (int i = 0; i <= 100; i++) {
			//조건문 I를 2로 나눈나머지가 0과 같지 않고 3으로 나눈 나머지가 0과 같지 않다면
			if (i % 2 != 0 && i % 3 != 0) { // if문에 마지막에 else를 써놓는게 좋다 .
				// SUM에 +=I를 하라 
				sum += i;
            //ELSE문
			} else {

			}//ELSE문 닫음

		}//FOR문 닫음
		System.out.println(sum);
	}//METHOD 닫음
	

}//CLASS
