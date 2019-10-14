package day03;

import java.io.IOException;

public class Hw01 {
	public static void main(String[] args) throws IOException {
		System.out.println("숫자입력 :");
		int value = System.in.read(); // <-ascii 코드 값을 바꿔서 숫자로 담아준다
		System.out.println(value);
		value -= 48;
		System.out.println(value);
		int result = value % 3;
		if (result == 0) { // <-3의 배수라면 나머지가 없을것   <-result 굳이 안만들고 value%3==0 으로 써도 된다. 연산자 우선순위에 의해 산술연산자가 우선이기 때문이다.
			System.out.println(value + "은 3의 배수입니다.");
		} else {
			System.out.println(value + "은 3의 배수가 아닙니다.");
		}

	}

}
