package day03;
//scanner를 위한 명령어
import java.util.Scanner;

public class StatementEx11 {//class 열음
	public static void main(String[] args) {//method 열음
		//출력
		System.out.println("태어난 년도 :");
		//scanner를 위한 명령어
		Scanner sc = new Scanner(System.in);
       //scanner를 위한 명령어
		int year = sc.nextInt();
       //출력
		System.out.println("입력한년도:" + year);
       //year를 12로 나눈 나머지
		year %= 12;
		// 년도 12로 나눈 나머지??
		// 쥐소 호 토 용 뱀 말양 원닭개돼
		// 4 5 6 7 8 9 101 10 12 3
		//조건문 12로 나눈 변수 year가 4와 같으면
		if (year == 4) {
			//이걸 출력
			System.out.println("당신은 쥐띠");
		//만약 조건을 만족하지않는다면 12로나눈 year의 값이 5라면 
		} else if (year == 5) {
			//이걸 출력하라
			System.out.println("당신은 소띠");
		} else if (year == 6) {
			System.out.println("당신은 호랑이띠");
		} else if (year == 7) {
			System.out.println("당신은 토끼띠");
		} else if (year == 8) {
			System.out.println("당신은 용띠");
		} else if (year == 9) {
			System.out.println("당신은 뱀띠");
		} else if (year == 10) {
			System.out.println("당신은 말띠");
		} else if (year == 11) {
			System.out.println("당신은 양띠");
		} else if (year == 12) {
			System.out.println("당신은 원숭이띠");
		} else if (year == 1) {
			System.out.println("당신은 닭띠");
		} else if (year == 2) {
			System.out.println("당신은 개띠");
		} else if (year == 3) {
			System.out.println("당신은 돼지띠");
		}// if문 닫음

		// 띠 : 12간지
		// 자축인묘진사오미신유술해

		// 태어난 년도 4자리 숫자를 입력
		// 스캐너를 사용해서 숫자 4자리 값을 입력 받지
		// 화면에 출력

		// 어떤 띠인지를 출력

	}//method 닫음

}//class 닫음
