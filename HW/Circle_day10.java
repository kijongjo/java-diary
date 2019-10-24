package HW_day10;

public class Circle_day10 extends Figure {
	int r;
   
	// setCalArea method는 공통적으로 사용.
	// 그래서 상위 class에 넣음
	// 그러나 매개변수와 {}안에 들어가는 식은 각자 다르니 상위 class에 들어있는 setCalArea method를 추상화 시켜서 매개변수와
	// {}안에 들어가는 식은 하위 class마다 각각 지정하기로 만든것
	//하지만 추상 class에서 ()안의 매개변수는 지정해주어야 한다. 수정할 수 있는 것은 {} 것이기 때문 overriding을 위해선 ()안의 매개변수 순서에 따라 찾아 식별한 후에 들어가기 때문이다. 
	void setCalArea(int r) {
	넓이 = (double)3.14 * r * r;

	}

	@Override
   double getCalArea() {
		
		return this.넓이;
	}
     


}
