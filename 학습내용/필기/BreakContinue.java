package day04;
//PACKAGE 열음

//break : 조건에 만족하게 되면 가장 가까운 반복문을 탈출
//continue : 조건에 만족하게 되면 이번만 생략
//break 라벨 : 라벨이 붙어있는 반복문을 탈출
//continue 라벨 : 라벨명이 붙어있는 반복문에서 이번만 생략

//요즘 추세 실무능력
public class BreakContinue {//CLASS 열음

	public static void main(String[] args) {//MAIN METHOD 열음
		// 위의 변수의 범위가 커지면 횟수가 기하급수적으로 커져서 시간이 매우오래걸린다. 반복횟수를 줄이기위해 break를 사용한다.
		// if(i>j)break;
        // BREAK LABEL 
		jay:
		//FOR 중첩문 J는 1부터 4 까지 1씩증가
			for (int j = 1; j <= 4; j++) { // 4행 4열로 16번 실행된다. 2중 포문이라면
		// FOR I는 1부터 4까지 1씩증가	
				for (int i = 1; i <= 4; i++) {
				//for (int k = 1; k < 4; k++) {// 4:x 4:y 4:z로 64번 실행된다. 3중 for문이라면
			     // I가J보다 크다면 멈춰라
				 if (i>j) break jay;        // i:1 j:1에서 끝이 난다  
					
				//if (i==j) continue jay; // 조건을 만족하면 이름을 준 문장 끝으로 가게 된다. jay(아무거나 써도 된다)는 lable하기 위해 붙인것.	
				                           // 만약 i=1 j=1이라면 출력하지 않고 바깥쪽의 for문의 j값이 올라가게 된다 .마치 바깥쪽이 움직이는 것처럼 보임. 
				 
				 //if (i == j)
				       //continue; // i==j일때만 생략하라.

				// if (i > j && j > k) // for문 바로 바깥쪽 관계도 가능 . 조건 두개도 가능.
					  // break; // if의 조건을 만나게 되면 가장 작은 {}를 탈출하라는 명령어

					System.out.println(" i : " + i + "  j : " + j);

				//}

			}//작은 FOR문 닫음
		}//큰 FOR문 닫음
	}//METHOD 닫음

}//CLASS 닫음
