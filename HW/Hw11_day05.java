package day05;
import java.util.Scanner;
public class Hw11_day05 {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("인덱스를 입력하세요:");
		 int index = sc.nextInt();
         int arr[] = { 20, 15, 30, 100, 99, 21, 11 };
		 int randome = (int)(Math.random() *10);

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 2) {
				arr[i]=index;
				System.out.print(arr[randome]);

			  }else {System.out.print(arr[i]);
			}
		}

	}

}
