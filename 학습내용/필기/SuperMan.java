package day09;

//자식임을 알려주는 명령어를 써야한다 .extends 부모 class 쓰기
//extends를 쓰는이유는 부모 class보다 더 확장된 기능을 추가하기 때문이다.
public class SuperMan extends Person {

	SuperMan(String 이름, String 직업, int 나이, float 키, float 몸무게) {
		// 부모 생성자 중에 가져올 것에 대해서 매개변수를 적어주고 (순서에맞게) 그중 없는것을 따로 추가해준다. 부모(기본),자식(확장)
		super(이름, 직업, 몸무게, 키);
		this.나이 = 나이;
		// 부모 CLASS에서 기본 생성자를 없애면 에러가 난다.
		// this(나를 가리킴),super(부모를 가리킴),this(); 나를 가리키는 생성자 , super();부모를 가리키는 생성자
		// 변수를 초기화 해달라고 할때 부모의 생성자로 super();를 해주어야 하는데 근데 이건 생략이 되어 있어서 super를 써주던 안써주던
		// 이미 초기화가 되어있게 된다.
		// SuperMan sm = new SuperMan();
		// System.out.println(sm.이름); 의 결과값이 아이유가 되는 이유가 그렇다. 부모의 변수 method를 물려 받는 다는 것을
		// 기억해야 한다.

		System.out.println("슈퍼맨 매개변수 있는 생성자 호출");
	}

	public void 레이져발사() {
		System.out.println("뿅뿅~~~");
	}

	public void 비행하기() {
		System.out.println("날아라 슈우우우우우웅");
	}

}
