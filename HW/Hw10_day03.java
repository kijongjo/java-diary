package day03;
//사용자 입출력 장치를 위한 명령어
import java.io.IOException;

public class Hw10 {//class 열음
	public static void main(String[] args) throws IOException {//method 닫음
		//출력
		System.out.println("입력:");
		//사용자 입출력 장치를 위한 명령어
		int value = System.in.read();
		//문자에대한 변수 a로 value를 변수정의내리고 형변환
		char a = (char) value;
		//문자에 대한 변수 c로 value를 변수정의내리고 형변환
		char c = (char) value;
		//출력되는 c의 값을 32감소시킴
		c -= 32;
		//문자에 대한 변수 b로 value를 변수정의 내리고 형변환
		char b = (char) value;
		//b는 32 증가시킴
		b += 32;
		//조건문 만약 value가 97보다크거나 같고 122보다 작거나 같으면 
		if (value >= 97 && value <= 122) {
			//이걸 출력하라 a변수와 c변수를 출력
			System.out.println("[출력]");
			System.out.println(a + "->" + c);
		//위의 조건을 만족시키지 못할경우 value가 65보다 크거나 같다면
		} else if (value >= 65) {
			//이걸 출력하라 a변수와 c변수를 출력
			System.out.println("[출력]");
			System.out.println(a + "->" + b);
		}//else문 닫음

		// 입력받은 문자를 대소전환.
		// 입력:a
		// [출력]
		// a->A
		// 입력:A
		// [출력]
		// A->a
	}//method 닫음

}//class 닫음
