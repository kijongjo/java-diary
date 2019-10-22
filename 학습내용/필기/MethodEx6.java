package day07;
//package
//가변형 인수
public class MethodEx6 {//class 열음
	// method 선언3가지 오버로딩
	static int avg(int x, int y) {

		return (x + y) / 2;
	}

	static int avg(int x, int y, int z) {

		return (x + y + z) / 3;
	}

	//method 선언 sum은 0부터 sum에 data의 요소를 다 더한다.
	static int avg(int... data) {// 가변형 인수 매개변수가 여러개일 수 있다. 그래서 이걸 쓴다.
		System.out.println(data);// 출력해보면 참조값이 나오는데 이는 입력한 값을 전부 배열로 만들어 담기 때문이다.
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			sum += data[i];
		}

		return sum / data.length;

	}//for문 닫음

	//main method 열음
	public static void main(String[] args) {
		//변순 선언 123
		int result = avg(100, 200);
		int result2 = avg(100, 200, 300);
		int result3 = avg(100, 200, 300, 400);
		//출력
		System.out.println(avg(100, 200));
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(avg(1873421740, 213124, 3123123, 1231223));


	}//method 닫음

}//class 닫음
