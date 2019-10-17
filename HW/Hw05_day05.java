package day05;
import java.util.Scanner;
public class Hw05_day05 {
	public static void main(String[] args) {
 //사용자로부터 10명의 성적 데이터를 입력받아 배열에 담고 학생들의 총점과 평균을 화면에 출력하세요 
		Scanner sc= new Scanner(System.in);
		System.out.println("성적을 입력하세요:");
		int score = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score2 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score3 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score4 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score5 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score6 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score7 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score8 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score9 = sc.nextInt();
		System.out.println("성적을 입력하세요:");
		int score10 = sc.nextInt();
	
	int[] c = {score,score2,score3,score4,score5,score6,score7,score8,score9,score10};
	int b = 0;
	int d = 0;
	for (int i = 0; i < c.length; i++) {
		b=c[i]+b;
		
	}
	System.out.println("총점: "+ b);
	System.out.println("평점: "+b/10);

	}
}