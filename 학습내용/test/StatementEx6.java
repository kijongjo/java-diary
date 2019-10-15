package day03;
//system.in.read를 사용하기 위한 옵션
import java.io.IOException;

//프로그램은 절차지향 하지만 선택적으로 실행하고 싶을 수 있고 그러한 기능이 있다 .
// 제어문- 조건분기문: 특정 조건에 따라 다른 문장을 실행시키고자할때
// if(조건) {
//	 문장1;
//	 문장2;
//                              <-특정 조건을 만족하면 {}안의 문장1,2을 실행한다 .
// }else if(조건){               <-if조건을 만족하지 않는다면 else의 if조건을 만족하는지 보고 {}문장3,4를 실행한다.
//  문장3;
//  문장4;
// }else{                       <-else if도 만족하지 않는다면 else의 {} 문장 5,6을 실행한다.      
//  문장5;
//  문장6;
//}
public class StatementEx6 {// main method 시작      
                                          //sysout in 을 사용하기위한 옵션
	public static void main(String[] args) throws IOException {

		System.out.print("숫자 입력:");
		//사용자입출력장치를 위한 명령어
		int value = System.in.read();
		System.out.println(value);
		//주어진 value에 48을 뺀다 
		value-=48;
		 System.out.println(value);
		 //변수 result는 주어진 value값의2를 나눈 나머지값이다.
		 int result = value%2;                         //<-value에서 2를 나눈 나머지 값
		 //조건문 만약 result가 0과 같으면
		 if(result == 0) {                             //<-result=0은 대입이라 x
			 //이걸 출력  
			 System.out.println(value + "는 짝수");
		 //그렇지 않다면
		 }else{
			 //이걸출력 
			 System.out.println(value+"는 홀수");
		 }//if문닫음
		// TODO Auto-generated method stub
		// value ==>숫자
		//value -=48; //<-내가 입력한 숫자의 아스키코드에서 값을 빼는것
		//System.out.println(value + "는 짝수");
		//System.out.println(value + "는 홀수");/*
		 /* 하지만 실행하게되면 짝수홀수 두개다 나온다.
		 * 
		 * if문을 통해 짝수면 짝수가 출력 홀수면 홀수만 출력하게 해야한다.
		 */
       
	}//method 닫음

}//class 닫음



