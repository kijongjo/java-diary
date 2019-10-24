package day10;

public class TestMain04 {
	public static void main(String[] args) {
   Marine m1 = new Marine();
   Medic me = new Medic();
	SiegeTank st = new SiegeTank();
   m1.공격하기(me);
	me.상태보기();
	//m1.공격하기(st);를 하기 위해선 마린이 시즈탱크공격하는 method 메딕공격 method등등 일일이 다 해주어야 한다.
	//그냥 공통점으로 부모 CLASS인 Terran x 를 해주면 된다. 즉 부모 참조변수에 자식 참조값이 들어갈수 있기 때문 (부모 참조변수=자식참조값;)
	//m1.공격하기(me) me의 참조값을 찾아감. Terran과 그외 후손 객체를 받을 수 있다. 
	
	}
}
