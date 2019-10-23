package day09;
//패키지 열기
public class GuGuDan {//class 열기
// 변수지정
	int dan;
    //생성자 지정 
	GuGuDan(int dan) {
		this.dan = dan;
	}//생성자 닫음

	//method 선언
	void print() {
		//구구단
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}//for문 닫음

	}//method 닫음

}//class 닫음
