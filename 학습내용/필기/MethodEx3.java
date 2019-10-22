package day07;
//package 열음
public class MethodEx3 {//class 열음
	
	static int getMaxValue(int[]M) {//배열도 method가능하다
		
		int max = 0;                // method의 변수명 맞추기 
		//for문 최대 표현을 위한
		for (int i = 0; i < M.length; i++) {
       
			if (max <= M[i]) {
				max = M[i];
  
			}
			 
		
		}
		return max;
	}//for문 닫음
//method index 표현
static int getMaxValuePosition(int[]M) {//배열도 method가능하다
		
		int max = 0;                // method의 변수명 맞추기 
		int pos = 0;
		for (int i = 0; i < M.length; i++) {

			if (max <= M[i]) {
				max= M[i];
				pos=i;
  
			}
			 
		
		}
		return pos;
	}//method 닫음


//배열의 최대값 위치를 찾고,지정한 값으로 변경 
//method 원본 수정하기 
static void setMaxValue(int[] x ,int value) {//배열도 method가능하다
int pos =getMaxValuePosition(x);
	x[pos]=value;	

}//method 닫음
	
//지역변수는 메서드가 종료할때 같이 사라지는 변수 
//호출한 변수에 영향을 미치지 않는다.
//참조값을 전달하면, 참조값을 통해서 변수의 수정이 가능하다.
//method 호출 방식에 따른 분류 
//Call by name: getMaxValue(); 
//Call by value : getNumber(4);        <-값의 수정 불가
//Call by refernce:setMaxValue(m,100); <-주소값을 주면 마음대로 원래 데이터를 수정 가능함.
//main method
public static void main(String[] args) {
          //m 배열 선언
		int[] m = { 23, 53, 22, 11, 66, 77, 88, 29 };
		int maxValue = getMaxValue(m);
	System.out.println(maxValue);
	
	//method를 position에 대입
	int position = getMaxValuePosition(m);
	System.out.println(position);
	
	//method 값
	setMaxValue(m,-100);
	System.out.println("----------------------------");
	
	//method를 position에 대입
	maxValue = getMaxValue(m);
	System.out.println(maxValue);
	
	
	int position1 = getMaxValuePosition(m);
	System.out.println(position1);

	}//main mathod 닫음
}//class 닫음
