package day10;

//패키지 열음
public class Medic extends Terran {// class 열음
	// member변수 설정
	int mp, 방어력, 회복력, maxmp;

	// medic method 만듦 매개변수 a와 b
	Medic() {
		maxmp = 100;
		maxhp = 200;
		hp = 200;
		x = 0;
		y = 0;
		mp = 100;
		방어력 = 0;
		회복력 = 8;
		사거리 = 10;
		이동속도 = 10;
	}// method 닫음

	void 힐링하기(Terran x) {
		System.out.println("치료 진행하겠습니다.");
		// 만약 진실이라면 x의 hp는 회복력만큼 오르고 mp는 10만큼 감소한다
		while (true) {
			x.hp += 회복력;
			mp -= 10;
			System.out.println("8만큼 hp가 치료되었습니다.");
			// 만약 x의 hp가 x의 maxhp와 같아지면 멈춰라
			if (x.hp == x.maxhp) {
				break;
				// 만약 mp==0이 되면 멈추어라
			} else if (mp == 0) {
				break;
			} // if문닫음
		} // while문 닫음
	}// method 닫음

	void 힐링하기(SiegeTank x) {
		System.out.println("치료 할 수 없는 유닛입니다.");
	}

//상태보기 method 만듦

	void 상태보기() {

		System.out.println("hp:" + hp);
	}

//포션먹기 method 만듦
	void 포션먹기() {

		// 만약 진실이면 mp는 20씩 증가시킨다
		while (true) {
			System.out.println("포션이  소비 되었습니다.");
			mp += 1;
			// 만약 mp가 200이되면 멈추어라
			if (mp == maxmp) {
				break;
			} // if문닫음
		} // while문닫음
	}// method 닫음

}// class 닫음
