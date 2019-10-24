package day10;

//마린 메딕에게 상속해서 코드를 주자 
public class Terran {

	int maxhp;
	int hp;
	int 사거리, 공격력, 방어력, 공격속도, x, y;
	int 이동속도;

	
	// 일반 변수
	void 이동하기() {
		System.out.println("gogogo");
	}

	// 일반 변수
	void 정지() {
		System.out.println("정지..");
	}

	// 패트롤 method 만듦
	void 패트롤() {
			System.out.println("감시");}

	void 상태보기() {
		System.out.println("------------");
		System.out.println("체력" + hp);
		System.out.println("x" + x);
		System.out.println("y" + y);
		System.out.println("공격속도:" + 공격속도);
    
		
	
	}

}
