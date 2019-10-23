package day09;
import day08.Marine;
//안전하게 객체를 만드는 방법
//변수에 직접 접근하지 못하도록 하게하자.
//로직 사용이 가능한 메서드를 통해서 작업을 하게 만든다.
//setXXX(); : SETTER METHOD
//GETXXX(); : GETTER METHOD라 한다.// 직접적으로 변수 BALANCE에 대입 못하게 만들고 안전한 루트로 대입시키는 방법
public class TestMain3 {//class testMain3 열음
	public static void main(String[] args) {//main 열음
        //새로운 객체 생성 instance 생성자
		ATM atm = new ATM();
        //atm 객체에 deposit기능 10000을 추가.
		atm.deposit(10000);
		// 20억 이상을 넣어버리면 overflow가 일어나버린다.
		// 2100000000원 입금합니다.
		// 현재 잔액: -189934592
		//atm.balance = 99999; 변수에 직접 접근 못하게 하도록 하기 위해 setBalance와 getBalance를 사용한다
		//atm객체에 캡슐기능을 통해 setter 50000입금 
		atm.setBalance(50000);
		//캡슐 과정을 통해 원하는 정보를 getter로 출력
		System.out.println("현재 잔액 조회: "+atm.getBalance());
		//atm객체에서 100출력
		atm.withDraw(100);
        //마린 객체 생성  
		Marine Marine1 = new Marine();  //day08의 Marine생성자에  pubilc
	    //atm객체 이름을 변경하기 
		atm.setName("조기종");
	    //getter를 통해 출력
		System.out.println(atm.getName());
	
	}

}
