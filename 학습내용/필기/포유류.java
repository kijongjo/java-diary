package day10;
//추상 CLASS
//추상class는 구현 메서드와  미 구현 메서드 둘다 가질 수 있다 하지만 추상 메서드를 1개라도 가지고 있는 클래스는 반드시 추상 클래스여야 한다. 
public abstract class 포유류 {
	int 눈, 코, 입, 귀, 꼬리;
	String 품종, 이름;
	//이 메소드는 상속을 위해 설정한 메서드 입니다.
	//이클래스를 상속받으면 반드시 오버라이드 해서 사용하세요.
	//미구현 메소드 
	//추상    메소드 <-METHOD 구현부가 없음. METHOD BODY가 없는 것. 아직 확정 짓지 않은것을 추상 메소드라고 한다. 
	//반드시 override 하란 말이다. 
	public abstract void 먹기();
	//이 메소드는 상속을 위해 설정한 메서드 입니다.
	//이클래스를 상속받으면 반드시 오버라이드 해서 사용하세요.
	public abstract void 자기();
	
}
