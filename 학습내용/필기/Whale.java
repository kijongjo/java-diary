package day10;
//패키지 열음
public class Whale extends 포유류 {//포유류와 상속관계인 whale
//whale의 기본 생성자
	Whale() {
		눈 = 2;
		코 = 1;
		입 = 1;
		귀 = 2;
		꼬리 = 1;
		품종 = "혹등고래";
	}
   //상위 class 추상 method를 채워넣음
	@Override
	public void 먹기() {
		System.out.println("새우를 먹어요");
	}

	@Override
	public void 자기() {
		System.out.println("어디서든 잠");
	}

	public void 헤엄치기() {
		System.out.println("음파~");
	}
}//class 닫음
