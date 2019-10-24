package day10;

public class Ghost extends Terran {// Ghost class 열음

	Ghost(int a) {// ghost 생성자
		maxhp = a;
		hp = a;
		사거리 = 10;
		공격력 = 10;
		방어력 = 0;
		공격속도 = 10;
		x = 0;
		y = 0;
	}// ghost 생성자 닫음

	// METHOD 핵미사일 발사
	void 핵미사일발사() {
		System.out.println("Ghost : 핵 미사일이 발사 되엇습니다.");
	}

	// 공격 TO MARINE
	void 공격하기(Terran x) {

		x.hp -= 10;

	}

}
