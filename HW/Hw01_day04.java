package day04;
//PACKAGE 열음

//SCANNER사용을 위한 명령어
import java.util.Scanner;

public class Hw01_day04 {//CLASS 열음
	public static void main(String[] args) {//MAIN METHOD 열음
		//SCANNER 명령어 
		Scanner sc = new Scanner(System.in);
		//입력 출력
		System.out.println("입력:");
		// SCANNER 명령어
		int number = sc.nextInt();
        // 조건문 NUMBER를 3을 나눈 나머지가 0과 같다면 아래의 값을 출력하라
		if (number % 3 == 0) {
			System.out.println(number + "는 3의 배수입니다.");
		//그렇지 않으면 아래것을 출력하라 
		} else {
			System.out.println(number + "는 3의 배수가 아닙니다.");

			// 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력

		}// ELSE 닫음

	}//METHOD 닫음
}// CLASS 닫음
