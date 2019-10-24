package day10;
//패키지 열기 
public class Child extends Parent {//child와 parent 상속관계 성립 
	//자식의 member 변수 
	String facebookID;
     ///기본생성자 설정 
	Child() {
		//부모의 기본생성자 불러오기
		super();
		//자식에게만 있는 특징 추가
		facebookID = "al";
		System.out.println("무매개변수 생성자 호출");
	}

	//클럽가기 method 추가 
	public void 클럽가기() {
		System.out.println("두둠칫");
	}//method 닫음

	@Override // compiler에게 상속받는게 맞는지 확인좀 해달라는 말이다. 없으면 에러가 발생한다.
	// 만약 override했는데 부모의 노래부르기 기능을 바꾸고싶은데 노래부르자로 실수로 바꾸게 되어 노래부르기를 호출해도 부모 기능이 호출되는
	// 불상사가 발생.
	// 그것을 막기위해 override 표시를하고 노래부르기 이름이 노래부르자로 바뀌게 되면 에러가 발생하도록 막는다.
	//부모 생성자에 있는 노래부르기 method를 고치고 override를 통해 오류 방지.
	public void 노래부르기() {
		System.out.println("나 좋은 꿈을 꿨어요~");
	
	
	}//methdoD 닫음
	public void 상태보기() {System.out.println(facebookID);}
}//class 닫음 
