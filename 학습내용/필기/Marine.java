package day10;

//패키지 열음
public class Marine extends Terran {// class 열음
	// member 변수,필드
	// 전역변수

	// 생성자
	// class 명과 똑같은 이름을 가지는 것
	// 객체의 초기화를 담당(변수의 초기값들을 미리 지정한다.)
	// 리턴값은 없지만 void라는 키워드 사용하지 않는다.
	// void가 있으면 생성자가 아니라 일반 메소드가 되어버린다.
	// 생성자 기본값을 가지게 설정한다.
	Marine() {// 매개변수가 없는 생성자 .
		maxhp = 100;
		hp = 100;
		x = 1;
		y = 2;
		공격력 = 8;
		공격속도 = 20;
		방어력 = 0;
		사거리 = 10;
		이동속도 = 12;

	}

	// 생성자 기본값을 설정하는데 int를 통해 값을 유동적으로 가지도록만든다
	Marine(int a) {// 매개변수에 값을 넣으면 특정 요소가 변하도록 설정.
		this();
		maxhp = a;
		hp = a;

		System.out.println("매개변수 있는 생성자");
	}

	// 생성자 OVERLOADING
	Marine(int hp, int x, int y) {
		// Marine의 기본 정보 불러오기
		this();
		maxhp = hp;
		this.hp = hp;
		this.x = x;
		this.y = y;

	}// 생성자 닫음
		// 생성자 overloading 체력 공격력 공격속도 이동속도에대한 생성자

	Marine(int 체력, int 공격력, int 공격속도, int 이동속도) {
		// 기본정보 불러옴
		this();
		maxhp = 체력;
		hp = 체력;

		this.공격속도 = 공격속도;

		this.이동속도 = 이동속도;
	}// Marine 생성자 닫음

	// 마린을 공격하기 위해 매개변수로 표현한다. 마치 배열처럼 원본에 찾아가 수정하는것처럼 .
	void 공격하기(Terran x) {
		System.out.println("공격하기 메서드에서 x : " + x);
		System.out.println("Marine : 두두두");
		x.hp -= 공격력;

	}

	// 일반 변수
	void 스팀팩() {
		// if문 hp가 3이하로 떨어지지 않도록 만들어줌.
		if (hp > 3) {

			System.out.println("스팀팩");

			hp -= 3;
			// 약간의 체력 감소

			// 공격속도 증가
			공격속도 += 2;

			// 이동속도 증가
			이동속도 += 2;
		}
	}

	// 일반 변수

}// class닫음
