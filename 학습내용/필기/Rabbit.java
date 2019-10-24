package day10;
//패키지 열음
public class Rabbit extends 포유류 {//포유류와 상속관계인 rabbit
    //rabbit 기본 생성자
	Rabbit() {
		눈 = 2;
		코 = 1;
		입 = 1;
		귀 = 2;
		꼬리 = 1;
		품종 = "앙골라";
		이름 = "토순이";
	}
   //method 
	public void 점프() {
		System.out.println("깡총 ");

	}
	//상위 class의 추상 method에 대한 출력 값을 넣음 
	@Override
	public void 먹기() {
		System.out.println("당근");

	}
	//상위 class의 추상 method에 대한 출력 값을 담음.
	@Override
	public void 자기() {
		System.out.println("쿨쿨");
	}
}//class 닫음
