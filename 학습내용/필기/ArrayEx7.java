package day05;

//package 열기
//주어진 수를 randome하게 뽑기
public class ArrayEx7 {// class 열기
	public static void main(String[] args) {// method 열기
		// 배열 정의하기
		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
				28, 29, 30 };
		// 0<=num
		// random 기능을 변수에 지정
		for (int j = 1; j < 10; j++) {

			int num2 = (int) (Math.random() * 30); // 형변환을 해주어야 소수값 안나오는것을 주의하라
			int num = (int) (Math.random() * 30);
			// for문 i는 0부터 1의 이하까지의 조건을 만족하게 실행

			System.out.println("rnd[num]: " + rnd[num] + "rnd[num]: " + rnd[num2]);

		
			int temp = rnd[num];
			rnd[num] = rnd[num2];
			rnd[num2] = temp;
			System.out.println(rnd[num] + " " + rnd[num2]);
		} // for문 닫음
		for (int i = 0; i < 6; i++) {
			System.out.println(rnd[i] + "\t");
		}
		System.out.println();
	}//method 닫음

}//class 닫음
