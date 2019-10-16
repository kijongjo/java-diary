package day03;
//scanner를 위한 명령어
import java.util.Scanner;

public class Hw12 {//class열음
	public static void main(String[] args) {//method 열음
      //출력
		System.out.println("시간입력:");
		//scanner를 위한 명령어
		Scanner sc = new Scanner(System.in);
		//scanner를 위한 명령어
		int time = sc.nextInt();
		//변수 day time을 606024로곱한 값으로 나눠라
		int day =time/(60*60*24);
		//변수 hour 계산된 day에 24를 곱하라
		int Hour= day*24;
		//변수 minutes 계산된 hour에 60을 곱하라
		int minutes= Hour*60;
		//변수 seconds 계산된 minutes에 60을 곱하라
		int seconds=minutes*60;
		//printf 위의 조건대로 출력하라 %d 정수를 출력
		System.out.printf("오늘은 %d일 %d시간 %d 분 %d초 입니다.",day,Hour,minutes,seconds);
		//int second = time;
		//int minute = second/60;
		//int Hour
	 
	
	}//method 닫음
}//class 닫음