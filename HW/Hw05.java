package day03;
// scanner 사용자 입출력 장치 명령어
import java.util.Scanner;

public class Hw05 {//class 시작
	public static void main(String[] args) {//method 시작
		//출력
		System.out.println("몇줄?");
		//scanner를 위한 명령어
		Scanner sc = new Scanner(System.in);
		//scanner를 위한 명령어 int값만 출력하게 하는 명령어
		int score = sc.nextInt();
		//반복문 중첩 j는 0부터시작 j는 입력한 score값보다 작거나 같고 j를 1씩 증가시켜라
		for (int j = 0; j <= score; j++) {
			//i는 0부터시작 i는 입력된 j보다 작고 1씩 증가시켜라
			for (int i = 0; i < j; i++) {
				//*위의 상황에 따라 *를 출력
				System.out.print("*");

			}//작은 반복문 닫음
			System.out.println();

		}//큰 반복문 닫음

	}//method 닫음

}//class 닫음
