package day10;
//패키지 열음
public class Parent {//parent class 생성
	//member변수 생성
	String name, job;
	int age;
    //기본 생성자 생성
	Parent() {
		name = "부모님";
		age = 50;
		System.out.println("부모 생성자");
	}
     //매개변수있는 생성자 생성
	 Parent(String 이름) {
		this.name = 이름;
	}
    //method 기능 추가
	public void 먹기() {
		System.out.println("맛난 것만 먹기");
	}
    //method 기능 추가
	public void 자기() {
		System.out.println("자기");
	}
    //method 기능 추가 
	public void 잔소리하기() {
		System.out.println("잔소리");
	}
   //method 기능 추가 
	public void 노래부르기() {
		System.out.println("노래부르기");
	}

	
	
	
	
	
}//class 닫음
//class 생성할때 name아래 modifiers에 보면
//public package(=default)가 있다. 
//superclass:부모 클래스를 말한다.
//java.lang.Object <-java.은 package class의 모든 조상은 Object이다.