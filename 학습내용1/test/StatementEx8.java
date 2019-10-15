package day03;

import java.util.Scanner; // 사용자로부터 숫자를 읽는 옵션 이걸 옵션을 넣어주라

//사용자로부터 값을 입력받는 방법  두번째
public class StatementEx8 {//class 열음
	public static void main(String[] args) {//main method 명령어
		//출력
		System.out.println("성적입력:");
		// 사용자로부터 숫자를 읽어옴 스캐너의 기능
		Scanner sc = new Scanner(System.in); // 사용자로부터 숫자를 읽는 옵션
		//변수 
		int score = sc.nextInt(); //위의 sc 명령어 에서 int형만 가져온다는 명령어 문자를 가져오면 에러가 뜨도록 되어있다
		//출력
		System.out.println("score:" + score); // ascii코드로 변환하지않고 바로 가져옴
	
	
	}//method 닫음
}//class 닫음


