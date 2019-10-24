package day10;

public class TestMain02 {
	public static void main(String[] args) {
		// Parent p1; <-어차피 parent의 생성자 주소를 버릴 것이니 new를 안한다.
		// child c1 = new child(); <-c1의 주소를 p1에 대입할 것이다. 그런데 대입하고나면 c1은 더이상 안쓸것이다.
		// 두줄의 코드를 한줄로 줄이고 공간 낭비를 막기위해 쓰는 소스코드가 존재한다(즉 만들어진 c1을 버리고 p1의 주소생성도 막는것)
		// 단, 둘이 상속관계여야만 가능하다
		Parent p1 = new Child();
	
	
	
	
	
	
	}
}
