package day05;
//package 열음
public class ArrayEx5 {//class 열음
	public static void main(String[] args) {//method 열음
		//m의 배열 선언 크기는 3행 2열
		int[][] m = new int[3][2];
		System.out.println(m); // m의 length는 3이다 찾아간 값
		//m[0] 참조값 출력
		System.out.println(m[0]); // <-여기도 참조값을 가지고잇다.
		//m[0][0]의 값 출력
		System.out.println(m[0][0]);
		// m.length = m을 찾아갔을 때 있는 칸수
		// m[0].length =m[]0을 찾아갔을 때 있는 칸수
       System.out.println("--------------------------");
		//변수 counter 선언
       int counter= 0;
       //for문 중첩 i는 0부터 길이는 열의 길이 이하로 출력하라
       for (int i = 0; i < m[0].length; i++) {
			//j는 0부터 j는 행의 길이 이하로 출력하라
    	   for (int j = 0; j < m.length; j++) {
       
    		   //counter 변수를 1씩 증가시켜라
    		   counter++;
				//counter를 m[j][i]에 대입하라
    		   m[j][i]= counter;
				System.out.println("["+j+"]"+"["+i+"]"+m[j][i])
				;
			}//for문 작은것닫음

		}//for문 큰것 닫음 
	}//method 닫음
}//class 닫음
