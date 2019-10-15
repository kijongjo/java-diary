package day03;

public class StatementEx7 {//class 열음
	public static void main(String[] args) {//method 열음
		/*
		 * int kor=55; int eng=90; int mat=70; //총점과 평균을 출력 System.out.print("총점:");
		 * System.out.println(kor+eng+mat); System.out.print("평균:");
		 * System.out.println((kor+eng+mat)/3);
		 */
		// 변수 정의 3가지
		int kor = 70;
		int eng = 90;
		int mat = 90;

		int total = kor + eng + mat;
		// 출력 총점 문자와 총합
		System.out.println("총점:" + total);
		// 실수형 타입의 변수 정의
		float avg = total / 3.0f; // <-3.0f을 하면(folat정의하기) float 타입이 되고 값도 float이 나온다.
		// 출력 평균 문자와 평균
		System.out.println("평균:" + avg);// int 나누기 float 하면 float이 더 커서 float형이 된다
		// if문 4가지
		if (avg >= 90) {
			System.out.println("당신의 학점은 A입니다.");   

		} else if (avg >= 80) {                   //<-만족하지 않으면 하는것.위의 조건을 만족하지 않으면 하기 때문에 굳이 명확한 제한점을 정의해줄 필요가없다.
			System.out.println("당신의 학점은 B입니다.");
		} else if (avg >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if (avg >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else if (avg < 60) {
			System.out.println("당신의 학점은 F입니다.");
		}

	}//method 닫음

}//class 닫음
