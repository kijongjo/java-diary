package HW_day10;

//hw6789
public abstract class Figure {

	double 넓이;

	// abstract void setCalArea();가 안되는 이유 .
	// 나의 의도 :
	// setCalArea method는 공통적으로 사용.
	// 그래서 상위 class에 넣음
	// 그러나 매개변수와 {}안에 들어가는 식은 각자 다르니 상위 class에 들어있는 setCalArea method를 추상화 시켜서 매개변수와
	// {}안에 들어가는 식은 하위 class마다 각각 지정하기로 만든것
	//
	abstract double getCalArea();

}
