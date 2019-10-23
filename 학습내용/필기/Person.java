package day09;

/**
 * @author JHTA
 *
 */
public class Person {

	String 이름;
	String 직업;
	String 성별;
	int 나이;
	float 몸무게;
	float 키;

	// 기본 생성자 ,return값이 없고 class명과 동일하다.

	Person() {
		이름 = "아이유";
		직업 = "가수";
		성별 = "여";
		나이 = 26;
		몸무게 = 50.42f;
		키 = 168.5f;
		System.out.println("Person 기본생성자");
	}

	// 매개변수 있는 생성자
	Person(String 이름, String 직업, float 몸무게, float 키) {
		this.이름 = 이름;
		this.직업 = 직업;
		
		
		this.몸무게 = 몸무게;
		this.키 = 키;

	}

	public void 먹기() {
		System.out.println("냠냠");
	};

	public void 잠자기() {
		System.out.println("Zzz..");
	};

	public void 눕기() {
		System.out.println("읏챠");
	};

}
