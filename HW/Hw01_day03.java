package day03;
//사용자 입력장치 명령어
import java.io.IOException;

public class Hw01 {//class 시작
	public static void main(String[] args) throws IOException {//method 시작
		//숫자입력 출력
		System.out.println("숫자입력 :");
		//사용자 입력장치 명령어
		int value = System.in.read(); // <-ascii 코드 값을 바꿔서 숫자로 담아준다
		//value 출력
		System.out.println(value);
		//value 값을 48 감소시킴
		value -= 48;
		//감소시킨 value값을 다시 출력
		System.out.println(value);
		//변수 result = 3으로 나눈 value값
		int result = value % 3;
		//조건문 result가 0이라면
		if (result == 0) { // <-3의 배수라면 나머지가 없을것   <-result 굳이 안만들고 value%3==0 으로 써도 된다. 연산자 우선순위에 의해 산술연산자가 우선이기 때문이다.
			//value값 출력
			System.out.println(value + "은 3의 배수입니다.");
		 //그게 아니라면
		} else {
			//이걸 출력
			System.out.println(value + "은 3의 배수가 아닙니다.");
		}//조건문 끝

	}//method 끝

}//class 끝
