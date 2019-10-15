package day03;
//사용자 입출력 장치를 위한 명령어
import java.io.IOException;

// 사용자로부터 값을 입력받는 방법 첫번째
// 화면 출력 system.out. <-모니터 표준출력장치
// 표준입력장치 system.in <-키보드  표준입력장치로 
// System.in.read(); <- 표준입력장치로부터 값을 입력받아 가져오라.
// ^위의 값을 쓰기 위해선 1.pakage 아래에 import java.io.IOException;을 입력      2.main method에 throws IOException을 입력 
public class StatementEx5 {//class 열음

	public static void main(String[] args)throws IOException {//method 열음
		// TODO Auto-generated method stub
        //사용자로부터 값을 입력 받아서 출력
		System.out.print("몇단?:");
		//표준입력장치로부터 값을 입력받아 가져오기
		int dan =System.in.read();
		//0:48,A:65, a:97
		System.out.println("사용자가 입력한값:"+dan);
		// 결과가 나오는 창에 직접 값을 입력하게 되면 사용자가 입력한 값에 ascii코드 값으로 나오게된다 .
		dan -=48; // 0의 ascii코드:48이므로 

		
		//반복문 i는 1부터시작 i는 9보다 작거나 같고 1씩증가
		for(int i =1;i<=9;i++) {
			//출력
			System.out.println(
					dan+"*"+i+"="+dan*i );
			
		}// for문 end
		
	}// main method end

}//class end

// 파일 생성시 pakage란에 pakage 이름을 쓰면 없을경우 새로 패키지를 만들고 있을경우 그곳에 속하게 된다.
// 아래부분에 main method 명령어를 체크하면 생성할때 미리 main method를 세팅해 놓는다.