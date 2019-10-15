package day03;
//scanner를 위한 명령어
import java.util.Scanner;

public class Hw11 {//class 열음
	public static void main(String[] args) {//method 열음
		//출력
		System.out.println("태어난 년도");
		//scanner를 위한 명령어
		Scanner sc = new Scanner(System.in);
		//scanner를 위한 명령어
		int year = sc.nextInt();
		//변수정의된 year의 값을 12로 나누라 그리고 그것의 나머지
		year %= 12;
		// 쥐소 호 토 용 뱀 말양 원닭개돼
		
		// 4 5 6 7 8 9 101 10 12 3
		//switch case 문year변수의 값이
		switch (year) {
		//4라면
		case 4:
			//이걸 출력하라
			System.out.println("당신은 쥐띠입니다.");
		//여기서 멈춰라
			break;
		case 5:
			System.out.println("당신은 소띠입니다.");
			break;
		case 6:
			System.out.println("당신은 호띠입니다.");
			break;
		case 7:
			System.out.println("당신은 토끼띠입니다.");
			break;
		case 8:
			System.out.println("당신은 용띠입니다.");
			break;
		case 9:
			System.out.println("당신은 뱀띠입니다.");
			break;
		case 10:
			System.out.println("당신은 말띠입니다.");
			break;
		case 11:
			System.out.println("당신은 양띠입니다.");
			break;
		case 12:
			System.out.println("당신은 원숭이띠입니다.");
			break;
		case 1:
			System.out.println("당신은 닭띠입니다.");
			break;
		case 2:
			System.out.println("당신은 개띠입니다.");
			break;
		case 3:
			System.out.println("당신은 돼지띠입니다.");
		
		

		}//switch문 닫음

	}//method 닫음

}//class 닫음
