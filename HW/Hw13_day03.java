package day03;

import java.util.Scanner;

public class Hw13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
	  System.out.println("잔돈 입금:");
	  
	  int M500 = coin/50000;
	  int M100 = coin%50000/10000;
	  int M50  = coin%10000/5000;
	  int M10  = coin%5000/1000;
	  int M5   = coin%1000/500;
	  int M1   = coin%500/100;
	  int M05  = coin%100/50;
	  int M01  = coin%50/10;
	  int M001 = coin%10;
	
        System.out.println("5만원권:"+M500+"매");
        System.out.println("1만원권:"+M100+"매");
        System.out.println("5천원권:"+M50+"매");
        System.out.println("1천원권:"+M10+"매");
        System.out.println("5백원권:"+M5+"매");
        System.out.println("1백원권:"+M1+"매");
        System.out.println("5십원권:"+M05+"매");
        System.out.println("1십원권:"+M01+"매");
        System.out.println("1권:"   +M001+"매");
        // 잔돈교환기(큰 단위 화폐순으로)
    // 1. 잔돈을 입력받는다
    // 2. 화폐를 변환한다. 50000권 10000권 5000권 1000권 500권 100 권 50권 10 권 1원
    // 3. 출력한다.
	
	
	}

}
