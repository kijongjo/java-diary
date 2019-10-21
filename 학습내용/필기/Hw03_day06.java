package day06;
//bubble sort 


public class Hw03_day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m = { 3, 2, 9, 8, 6, 1 };
		int temp = 0;
		for (int j = m.length-1; j >= 1; j--) {//맨 마지막 것을 할 필요는 없기 때문.

			for (int i = 0; i < j; i++) {
				if (m[i] > m[i + 1]) {

					temp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = temp;

				}
			}
			for (int i = 0; i < m.length; i++) {
				System.out.print(m[i]);
			}
			System.out.println();
		}
	}
}
