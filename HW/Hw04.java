package day03;

//절차적 사고 :  무엇을 해야할지 순차적으로 생각하는 방법이 중요하다.
public class Hw04 {//class 시작
	public static void main(String[] args) {//method 시작
		//반복문 i를 0부터시작 i를 100이하로 1씩 증가시키자
		for (int i = 0; i < 100; i++) {
            //만약 i를 2로나눈 수가 0이라면
			if (i % 2 == 0) {
				// ***를 출력하라
				System.out.println("***");
			// 0이 아니라면
			} else {
				// 그냥 i를 출력하라 
				System.out.println(i);
			}//조건문닫음
		}//반복문 닫음
            // 변수선언은 밖에 해야한다. 왜냐하면 반복문 안쪽에 선언하면 
		  // 돌때마다 계속 변수선언을 새로하기 때문에 쌓이지 않는다.
		// 한글로 무엇을 하고싶은지 생각하고나서 주석으로 표시후 하나씩 바꾸기.F
		//sum변수의 정의
		int sum = 0;
		//반복문 i가 1부터시작 i는 100보다 작거나 같고 1씩 증가시켜라
		for (int i = 1; i <= 100; i++) {
            //만약 i를 2로 나누었을때 0과 같고 sum을 2로 나누었을때 0과같으면
			if (i % 2 == 0 && sum % 2 == 0) { // sum%
				//i를 출력하라
				System.out.println(i);
                //sum을 1씩증가시켜라
				sum += i;
			}//조건문닫음

		}//반복문닫음
		System.out.println(sum);

	}//method 닫음

}//class 닫음
