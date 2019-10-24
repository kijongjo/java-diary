package day10;
//Object : 사물, class: 설계도, abstract class: 조감도

//추상화

public class TestMain05 {
	public static void main(String[] args) {

		// 3. 추상화: 구체적인 사실들을 일반화 시켜 기술한것.

		// 개 토끼 고래 간에는 공통점이 있다. 이러한 공통점을 모아서 상위 CLASS를 만드는 것을 추상화라고 한다.반대로 오히려 개별특성들 좀더
		// 내려가는것을 구체화라고 한다.
		// 포유류 CLASS를 만들수가있다.

		// 상속 목적으로 개념상 존재하는 클래스가 //실제 인스턴스화 되는 문제가 발생 할 수 있다.
		// m이라는 객체가 생긴다는게 이상한 것이다. 포유류라는 이름을 가진 동물은 없기 때문. 진짜로 존재하는 애가 아니다.
		// 그래서 만들지 못하게 막는 방법? class 부분에 abstract를 넣어준다.
		// 포유류 m = new 포유류();
		// m.먹기();
		System.out.println("--------------------------");
		Dog D1 = new Dog();
		D1.자기();
		D1.먹기();
		D1.달리기();
		System.out.println("--------------------------");
		Rabbit R1 = new Rabbit();
		R1.자기();
		R1.먹기();
		R1.점프();
		System.out.println("--------------------------");
		Whale W1 = new Whale();
		W1.자기();
		W1.먹기();
		W1.헤엄치기();
		System.out.println("--------------------------");
		Horse H1 = new Horse();
		H1.먹기();
		H1.자기();
		H1.달리기();
	}

}
