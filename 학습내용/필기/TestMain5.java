package day09;

public class TestMain5 {
	public static void main(String[] args) {
//슈퍼맨 class를 불렀는데 이름이 iu가 나온다. 즉 부모 자식관계가 성립되어 상속되어버린다. 

		SuperMan sm = new SuperMan("클라크", "사진기사", 20, 190.0f, 70.0f);

		System.out.println(sm.이름);

		sm.레이져발사();
		sm.비행하기();
		
	}
}
