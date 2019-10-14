package day03;

//절차적 사고 :  무엇을 해야할지 순차적으로 생각하는 방법이 중요하다.
public class Hw04 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				System.out.println("***");
			} else {
				System.out.println(i);
			}
		}
            // 변수선언은 밖에 해야한다. 왜냐하면 반복문 안쪽에 선언하면 
		  // 돌때마다 계속 변수선언을 새로하기 때문에 쌓이지 않는다.
		// 한글로 무엇을 하고싶은지 생각하고나서 주석으로 표시후 하나씩 바꾸기.F
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0 && sum % 2 == 0) { // sum%
				System.out.println(i);

				sum += i;
			}

		}
		System.out.println(sum);

	}

}
