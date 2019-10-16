package day04;
//package 열음
import java.util.Scanner;
// scanner 사용을 위한 명령어
//자판기 만들기  
public class VendingMachine {//class열음

	public static void main(String[] args) {//main 명령어 열음
		//음료자판기 출력
		System.out.println("    ----음료 자판기----");
		// TODO Auto-generated method stub
		//코카콜라 2500 출력 나머지도 같은 방식 출력
		System.out.println("-- 1.코카콜라    : 2500 원 --");
		System.out.println("-- 2.사이다       : 1800 원 --");
		System.out.println("-- 3.환타          : 2200 원 --");
		System.out.println("-- 4.테라          : 4000 원 --");
		System.out.println("-- 4.소주          : 3500 원 --");
		System.out.println("------------------------");
        //지폐를 넣어주세요 출력 사용자 입력이 편하도록 
		System.out.println("지폐를 넣어주세요 :");
		//사용자 입력을 위한 명령어
		Scanner sc = new Scanner(System.in);
		//사용자 입력을 위한 명령어2
		int money = sc.nextInt();
		// 사용자가 입력한 값을 출력함
		System.out.println("money :" + money);
		//위의 출력하는 값이 끝난후 음료선택란 출력
		System.out.println("음료를 선택해 주세요:");
		// 사용자 입출력장치 사용을 위한 명령어
		int choice = sc.nextInt();
		//사용자가 입력한 값을 출력
		System.out.println("선택한 음료:" + choice);
		//수량을 선택함
		System.out.println("수량을 선택해 주세요:");
		// 사용자가 입출력장치를 위한 명령어
		int cnt = sc.nextInt();
		//종류 선택 알림을 위한 출력
		System.out.println(cnt + "개를 선택하셨습니다.");

		//변수 지정
		int price = 0;  // 그냥 초기화 해준것이다. 
		//조건문 만약 choice가 1이라면
		if (choice == 1)
			//가격은 2500 대입
			price = 2500;
		//그렇지 않다면 choice가 2라면
		else if (choice == 2)
			//가격은 1800대입
			price = 1800;
		//그렇지 않다면 choice가 3이라면
		else if (choice == 3)
			//가격은 2200대입
			price = 2200;
		//그렇지 않다면 choice가 4라면
		else if (choice == 4)
			//price 4000대입
			price = 4000;
		//그렇지 않다면 choice가 5라면
		else if (choice == 5)
			//price 3500대입
			price = 3500;
		// 고객이 구매하려고하는 제품의 가격
		//변수 exprice는 price와 cnt의 곱
		int exPrice = price * cnt; // 2500*2==>5000
		//출력
		System.out.println("제품가격:" + price);
		System.out.println("예상 제품가격:" + exPrice);
		// 예상 제품 가격과 , money 비교해서
		
		//자판기  입력한 money의 값에 50000을 나누어라
		int M500  = money / 50000;
		// 50000을 나눈 나머지 값에 10000을 나누어라
		int M100  = money % 50000 / 10000;
		// 10000을 나눈 나머지값에 5000을 나누어라
		int M50   = money % 10000 / 5000;
		// 5000을 나눈 나머지값에 1000을 나누어라
		int M10   = money % 5000 / 1000;
		// 1000을 나눈나머지 값에 500을 나누어라
		int M5    = money % 1000 / 500;
		// 500을 나눈 나머지 값에 100을 나누어라
		int M1    = money % 500 / 100;
		//100을 나눈 나머지 값에 10을 나누어라
		int M01   = money % 100 / 10;
		//10을 나눈 나머지값
		int M001  = money % 10;
		//조건문 만약 money의 값이 exprce보다 클경우에
		if (money > exPrice) { // if 안에 IF문이 또들어갈수 있다.
			// money > 예상 제품 가격
			// 제품 판매
			//money에서 exprice뺀값을 계산하라 
			money -= exPrice;
			// 위의 계산 값을 출력하라
			System.out.println(choice + "번 상품" + cnt + "개" + "잔액은:" + (money));
             // money-=exprice에서 계산된 M500변수값을 계산하라
			System.out.println("5만원권:" + M500 + "매");
             // money-=exprice에서 계산된 M100변수값을 계산하라
			System.out.println("1만원권:" + M100 + "매");
			//money-=exprice에서 계산된 M50변수값을 계산하라
			System.out.println("5천원권:" + M50 + "매");
			//money-=exprice에서 계산된 M10변수값을 계산하라
			System.out.println("1천원권:" + M10 + "매");
			//money-=exprice에서 계산된 M5변수값을 계산하라
			System.out.println("5백원권:" + M5 + "매");
			//money-=exprice에서 계산된 M1변수값을 계산하라
			System.out.println("1백원권:" + M1 + "매");
			//money-=exprice에서 계산된 M01 변수값을 계산하라
			System.out.println("1십원권:" + M01 + "매");
			//money-=exprice에서 계산된 M001변수값을 계산하라
			System.out.println("1권:" + M001 + "매");
          //그렇지않으면 3가지 값을 출력하라 
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("다시 진행해 주십시요");
			//MONEY는 그대로 출력하라
			System.out.println("반환금: " + money);
		}//ELSE문 닫음

		// money <예상 제품가격 : 잔액이 부족합니다.

	}//METHOD 닫음

}//CLASS닫음
