package day09;

//패키지 열음
public class Human {// class 열음
	// 속성
	// 속성을 나타내기위한 전역변수,멤버 변수
	int 나이, 팔, 다리, 눈, 코;

	
	String 이름, 직업, 성별, 전화번호;

	//생성자 기본
	Human() {
		this.이름 = "홍길동";
		this.직업 = "도적";
		this.전화번호 = "010-123-5678";
		this.성별 = "남";
		this.나이 = 20;
	}
    //생성자 OVERLOADING  
	Human(String 이름, int 나이, String 성별, String 전화번호, String 직업) {
		//생성자 OVERLOADING중 기본정보를 불러온다. 
		this(이름,직업,성별); //아래의 생성자를 불러옴
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
		this.전화번호 = 전화번호;
		this.직업 = 직업;

	}//생성자 닫음
    //다른 생성자 이름 직업 성별을 변수로 주고 값 변환
	Human(String 이름, String 직업, String 성별) {
		//기본생성자의 정보를 불러옴
		this();  //<-기본생성자를 불러오는 것이다. 주의할정음 항상 위에 와야한다 . 아래에 두면 입력값을 덮어 씌우게 된다.
		
		this.이름 = 이름;

		this.성별 = 성별;

		this.직업 = 직업;
		

	}//생성장 닫음

	//상태보기 METHOD 
	void 상태보기() {
		System.out.println("이름:" + 이름);
		System.out.println("직업:" + 직업);
		System.out.println("전화번호:" + 전화번호);
		System.out.println("성별:" + 성별);
		System.out.println("나이:" + 나이);
	}//METHOD 닫음
}// class 닫음
