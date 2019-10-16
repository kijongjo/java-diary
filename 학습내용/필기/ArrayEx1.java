package day04;
//package 열기
public class ArrayEx1 {//class 열기
	public static void main(String[] args) {//main 열기
		int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10; // <- 변수 선언

		a1 = 10;
		a2 = 20;
		a3 = 30;
		a4 = 40;
		a5 = 50;
		a6 = 60; // <-대입
		a7 = 70;
		a8 = 80;
		a9 = 90;
		a10 = 100;

		for (int i = 1; i <= 10; i++) { // 반복문
			// System.out.println(ai); //<-불가능
		}
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5); // <-출력
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);

		// 위의 변수들을 하나씩 출력하지않고 반복문도 쓸수 있도록 하는것이 ARRAY를 함.

		// 배열 :apt 변수
		// 동일한 사이즈에 연속된 공간에 할당되는 변수
		// 배열선언
		// 자료형[] 변수명;
		// 자료형 변수명[];
		// int[]m; or int m[]

		//array 선언
		int[] m;
		//array의 크기 결정
		m = new int[3]; // <-int크기의 변수 3개를 만들어라.
		//m의 주소 출력
		System.out.println(m);

		m[0] = 10;
		m[1] = 20;
		m[2] = 30; // <-인덱스라고 한다. apt형 변수를 구성하는 요소들
		System.out.println("m[0]" + m[0]);
		System.out.println("m[1]" + m[1]);
		System.out.println("m[2]" + m[2]);
		// 반복문으로도 쓸수 있다.
		for (int i = 0; i < 3; i++) {
			m[i] = (i + 1) * 10;
			System.out.println("m[" + i + "]:" + m[i]);
		}

		System.out.println("------------------------------------");
		// int 크기의 배열 c를 선언
		// 5개의 변수를 같도록 하자 .
		// 5,10,15,20,25 값을 대입
		// 이값을 화면에 출력

		//변수 c 선언
		int[] c;
		//c의 크기 
		c = new int[6]; // <- 번호6이 아닌 6칸을 주는것이라 주의할것. 배열은 0부터시작한다.
		System.out.println(c);// <-참조값
		c[0] = 5; // <-각 칸마다 무엇으 배정할지
		c[1] = 10;
		c[2] = 15;
		c[3] = 20;
		c[4] = 25;
		c[5] = 30;
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		System.out.println(c[5]);
		//for 반복문 범위는 0부터 6까지
		for (int i = 0; i < 6; i++) { // <-조건에서 <=는 안된다.
										// 배열의 길이는 알수 있다면 해결가능
			c[i] = (i + 1) * 5; // d.length로 에러를 줄일 수 있다
			System.out.println(c[i]);
		}
		//for 반복문 선언 
		int[] d;
		d = new int[4];
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		d[3] = 4;
		System.out.println(d[1]);

		//for 반복문 선언
		for (int i = 0; i < d.length; i++) { // 배열의 크기
			//array의 값 
			d[i] = i;
			System.out.println(d[i]);

		}
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		//int변수 선언
		int[] k;
		
		k = new int[7];
		//반복문 선언
		for (int x = 0; x < k.length; x++) {
			k[x] = 2 * (x + 1) - 1;           // <-(i+1)을 해주어야 용량 1칸을 더 안먹는다 .
			System.out.println(k[x]);
			
			                               // 공통된 변수 바꾸기 드래그후에 컨트롤 2 아래 바에 rename 클릭후 바꾸기
        
			
	  
		
	
		}//for 닫음

	}

}
