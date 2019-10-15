package day03;

//오늘 날짜 출력
public class StatementEx10 {//class 열음
	public static void main(String[] args) {//method 열음
		System.out.println("오늘은 \n 축구 \t 하는날");
        //변수 정의
		int year = 2019;
		int month = 10;
		int day = 15;
		// 오늘은 2019년 10월 15일 입니다.
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일" + "입니다.");
       
		System.out.printf("오늘은 %d 년 %d월 %d일 입니다.", year, month, day); // 문장속에 %d %는 십진법
		// 첫번째 인수값에 출력형식을 정하고
		// 두번째 자리부터 값을할당한다.
		// %d : 정수, %b:논리 , %c: 문자, %f:실수
		// %s : 문자열을 의미

		int hour = 16;
		int minute = 40;
		int second = 50;
		// 지금 시간은 16시 40분 50초 입니다.
		System.out.printf("오늘은  %d시 %d분 %d초 입니다.\n", hour, minute, second);
		
		
		
		
		
	
		
		
		
		

	}//method 닫음

}//class 닫음
