package day03;

import java.io.IOException;

public class Hw02 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자 입력:");
		// 65~97대문자 97이상 소문자
		int value = System.in.read();
		System.out.println(value);
		//문자로 출력 <- ascii 코드로 나오는 출력값을 문자로 바꾸어야한다.
		char c = (char)value; //<- value의 값은 int라서 value의 char로 바꾸는 강제 형변환이 이루어져야 한다. int가 char보다 공간이 더커서 강제 형변환이 이루어져야 한다.
		if (value >= 65 && value < 91) {   //<- boolean type이기 때문에 논리 연산자 &&
			System.out.println(c + "는 대문자입니다.");
		} else if (value >= 97 && value <122) {
			System.out.println(c + "는 소문자입니다");
		} else if(value >=48 && value <=57) { System.out.println(value-48 + "는 한글 또는 장문입니다.");} //<-value에 숫자 환산을 위한 48을 빼주고 한다

	
	
	
	}

}
