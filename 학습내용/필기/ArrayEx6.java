package day05;
//package열음
//2차원 배열의 초기화 
public class ArrayEx6 {//class 열음
	public static void main(String[] args) {//method 열음
        //배열의 초기화 4행 3열
		int[][] m = { { 0, 0, 0 },      //<-4행 3열
				      { 0, 1, 2 , 1, 2, 3, 5 }, 
				      { 0, 2, 4 ,3,2 }, 
				      { 0, 3, 6 } 
				      };
        //for문의 중첩 i는 0부터 행의 길이까지 1씩 증가시키는 범위
		for (int i = 0; i < m.length; i++) {
			//for문의 중첩 j는 0부터 행의 길이까지 1씩 증가시키는 범위
			for (int j = 0; j < m[i].length; j++) { 
				System.out.print(m[i][j]);
				
			}//for문 닫음
		  System.out.println();
		}//for문 닫음
		
		
	}//method 닫음

}//class 닫음
