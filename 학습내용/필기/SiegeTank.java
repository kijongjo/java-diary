package day10;

//패키지 열음
public class SiegeTank extends Terran {// siegetank클래스
	int 공격력, 공격속도;

	// 생성자
	SiegeTank() {

		hp = 400;
		사거리 = 7;
		공격력 = 20;
		방어력 = 0;
		공격속도 = 6;

		이동속도 = 20;
	}

	// method siegemode 생성
	void SiegeMode() {
		System.out.println("시즈모드 가동중");
	}

	// method 공격 to marine x
	void 공격하기(Terran x) {

		x.hp -= 30;
	}

}
