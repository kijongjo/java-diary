package day03;

//������ ��� :  ������ �ؾ����� ���������� �����ϴ� ����� �߿��ϴ�.
public class Hw04 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				System.out.println("***");
			} else {
				System.out.println(i);
			}
		}
            // ���������� �ۿ� �ؾ��Ѵ�. �ֳ��ϸ� �ݺ��� ���ʿ� �����ϸ� 
		  // �������� ��� ���������� �����ϱ� ������ ������ �ʴ´�.
		// �ѱ۷� ������ �ϰ������ �����ϰ��� �ּ����� ǥ���� �ϳ��� �ٲٱ�.F
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0 && sum % 2 == 0) { // sum%
				System.out.println(i);

				sum += i;
			}

		}
		System.out.println(sum);

	}

}
