package day03;
//scanner 명령어
import java.util.Scanner;

public class Hw03 {//class 시작
	public static void main(String[] args){//method 시작
		//출력
		System.out.println("성적출력:");
		//scanner 장치를 위한 명령어
		Scanner scan = new Scanner(System.in);
		//scanner 값중 int만 출력가능하게 하는 명령어
		int score = scan.nextInt();
        //조건문 score를 90이상이라면
		if (score >= 90) {
			//이걸출력
			System.out.println("당신의 점수는" + score + " " + "학점은 A학점");
		//80이상
		} else if (score >= 80) {
			System.out.println("당신의 점수는 " + score + " " + "학점은 B학점");
		//70이상
		} else if (score >= 70) {
			System.out.println("당신의 점수는" + score + " " + "학점은 C학점");
		//60이상
		} else if (score >= 60) {
			System.out.println("당신의 점수는" + score + " " + "학점은 D학점");
		}//조건문닫음

	}//method 닫음
	

}//class닫음
