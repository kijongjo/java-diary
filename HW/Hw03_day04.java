package day04;

//hw 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오 
import java.util.Scanner;

public class Hw03_day04 {//CLASS
	public static void main(String[] args) {//METHOD
		//SCANNER 사용 명령어
		Scanner sc = new Scanner(System.in);
		//합계 출력
		System.out.println("합계 :");
		//SCANNER 사용 명령어
		int sum = sc.nextInt();
		//주사위 면수
		System.out.println("주사위 면수 :");
		//변수 I지정 SCANNER 사용 명령어
		int i = sc.nextInt();
		//두번째 주사위 면수 출력
		System.out.println("두번째 주사위 면수 :");
		//변수 I지적 SCANNER 사용 명령어
		int j = sc.nextInt();
	
		
		//FOR문 중첩과 IF문 중첩
		//FOR문 I2는 1부터 I보다 작은 수까지 
		for ( int i2 = 1; i2 <= i; i2++) { // 조건식 부등호 조심할것.
			//FOR문 J2는 1부터 J보다 작은수까지 1씩증가
			for (int j2 = 1; j2 <= j; j2++) {
				// I2+J2 SUM과 같지 않다면
				if (i2+j2 != sum) {
              //ELSE문 출력
				} else {
					System.out.println("(" + i2 + "," + j2 + ")");

				}//ELSE문 닫음

			}//FOR문 닫음

		}//FOR문 닫음
	}//METHOD 닫음

}//CLASS 닫음
