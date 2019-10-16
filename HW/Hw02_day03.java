package day03;
//사용자 입출력장치 명령어
import java.io.IOException;

public class Hw02 {//class시작
	public static void main(String[] args) throws IOException {//method시작
		//문자입력 출력
		System.out.println("문자 입력:");
		// 65~97대문자 97이상 소문자
		//사용자 입출력 장치 명령어
		int value = System.in.read();
		//value 출력
		System.out.println(value);
		//문자로 출력 <- ascii 코드로 나오는 출력값을 문자로 바꾸어야한다.
		//문자로 출력 value값을 형변환시킴 
		char c = (char)value; //<- value의 값은 int라서 value의 char로 바꾸는 강제 형변환이 이루어져야 한다. int가 char보다 공간이 더커서 강제 형변환이 이루어져야 한다.
		//조건문 value가 65 그리고 value가 91 이하 
		if (value >= 65 && value < 91) {   //<- boolean type이기 때문에 논리 연산자 &&
			// 조건에 맞으면 이걸 출력
			System.out.println(c + "는 대문자입니다.");
		 //조건에 안맞으면 value가 97그리고 122사이에서
		} else if (value >= 97 && value <122) {
			//이걸 출력하라
			System.out.println(c + "는 소문자입니다");
		//두번째 조건이 안맞으면 value값을 48에서 57조건에따라 이걸 출력하라.
		} else if(value >=48 && value <=57) { System.out.println(value-48 + "는 한글 또는 장문입니다.");} //<-value에 숫자 환산을 위한 48을 빼주고 한다

	
	
	
	}//method 닫음

}//class 닫음
