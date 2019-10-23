package day09;

public class ATM {// public 즉 아무 package에서나 쓸수 있다.
	// private int balance;//이 파일내에서만 쓰기 가능하다. 그 이외의 것은 쓸수가없다.
	private int balance;
	// private 변수 : 보이지 않도록 만든다 변수앞에 써주어 정보 보호하는 것을 (접근 지정자,접근 수정자 , 접근 한정자.)
	private String name; // 아무것도 쓰지않으면 기본값인 default이다.
	String accoutNo; // 어디서부터 얼마나 접근할 수 있다는 것을 써주는 것이다.
							
    public String getName() {
       return this.name;
    }
	public void setName(String name){
		//바로 대입시키는게 아닌 최종적으로는 조건문으로 값을 입력한 사람이 권한이 있는지 없는지 확인한후에 변환을 할지를 결정하게 된다. 
		this.name=name;
	}
    
	public int getBalance() {
		// 멤버변수의 값을 리턴한다.
		return this.balance;
	}

	// 값을 지정한다. : setBalance(5000);
	public void setBalance(int balance) {
		//권한 있는지?
		// 기록을 남긴다 . 
		this.balance = balance;

	}

	
	// 종류 private:현재 클래스에서만 접근가능
	// default:현재 클래스와 동일 패키지에서만 접근 가능
	// 입금 //protected: 동일 package와 상속관계에 있는 것들만 사용가능하다
	void deposit(int a) { // public:어디에서나 접근 가능하다. 으로 총 4가지가 존재한다.
							// *import는 같은 package에서 찾는게아닌 다른 package에서 찾도록 하는것.
		balance += a; // 거꾸로 public을 변수에 써주면 IMPORT를 따로 써줄 필요가 없다.
		System.out.println(a + "원 입금합니다.");
		System.out.println("현재 잔액: " + balance);

	}

	// 출금
	void withDraw(int a) {
		if (balance >= a) {
			balance -= a;
			System.out.println(a + "원 출금합니다");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("현재 잔액:" + balance);

	}

}
