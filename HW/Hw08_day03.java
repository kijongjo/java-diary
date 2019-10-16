package day03;

public class Hw08 {// class 열음
	public static void main(String[] args) {// method 열음
		// 반복문 중첩 i는 2부터시작 i는 9보다 작거나 같음 i는 1씩 증가
		for (int i = 2; i <= 9; i++) {
			// j는 1부터시작 j는 9보다 작거나 같음 1씩 증가
			for (int j = 1; j <= 9; j++) {
				// 출력 i*j=i*j
				System.out.print(i + "*" + j + "=" + i * j + "\t"); // <- 두칸 뛰라를 대신하는것

			}//작은반복문닫음
			//출력 띄어쓰기
			System.out.println();
		}//큰 반복문 닫음
	}//method닫음
}//class 닫음
