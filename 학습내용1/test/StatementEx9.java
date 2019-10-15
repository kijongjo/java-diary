package day03;
//scanner 를 위한 명령어
import java.util.Scanner;

//switch case문
public class StatementEx9 {//class 열음
	public static void main(String[] args) {//method 열음
		System.out.println("성적입력:");
		//scanner를 위한 명령어
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // 문자 읽어오는것은 next
        //if else로도 얻을 수 있음.
		
		switch (score) { // <- switch(입력값[스위치]){조건에따른 결과값}
		case 100:// case 10: // <- 계속 실행하는 것을 막기위해 break 명령어 사용 
			//명령어중 아래 출력문장은 99와 같으니 case10만 입력해도 된다.
			System.out.println("A학점"); // 99입력하면 CASE99로 가서 A학점 뽑고 그 밑으로 계속 실행하게 된다. 결과값 성적입력 99 A학점 B학점
			break; // <- 계속 실행하는 것을 막기위해 break 명령어 사용
		case 99://  case 9:
			System.out.println("A학점"); // <-점수가 무엇이냐에 따라 값이 다르게 하는것
			break;
		case 80:// case8:
			System.out.println("B학점"); // 하지만 98점은 안나온다 즉 스위치문은 점수가 딱 case에 맞는 것만 나온다.
			break;                      // 이를위해 score를 /10을 하게되면 몫은 9 ,10 8 등이 되는데 이를 이용해 범위를 지정할 수있다.
			                           // 93/10 은 java에선 인트끼리의 계산이기 때문에 9이다.
		
		default:
			System.out.println("F학점"); // case이외의 것들은 default 값으로 정의 내려버릴 수있다.
		   break;
		
		}//switch case 문 닫음

		/*
		 * 제어문 -반복문, 조건분기문 :if switch case문
		 * 
		 * 
		 * 
		 * 
		 * 1. 사용자로부터 성적을 입력받는다. Scanner sc=new Scanner(System.in);
		 * 
		 * 
		 * 2. 점수에 따라 성적을 출력한다.
		 */
	}//method 닫음
}//class 닫음
