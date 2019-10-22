package day07;
//package
//������ �μ�
public class MethodEx6 {//class ����
	// method ����3���� �����ε�
	static int avg(int x, int y) {

		return (x + y) / 2;
	}

	static int avg(int x, int y, int z) {

		return (x + y + z) / 3;
	}

	//method ���� sum�� 0���� sum�� data�� ��Ҹ� �� ���Ѵ�.
	static int avg(int... data) {// ������ �μ� �Ű������� �������� �� �ִ�. �׷��� �̰� ����.
		System.out.println(data);// ����غ��� �������� �����µ� �̴� �Է��� ���� ���� �迭�� ����� ��� �����̴�.
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			sum += data[i];
		}

		return sum / data.length;

	}//for�� ����

	//main method ����
	public static void main(String[] args) {
		//���� ���� 123
		int result = avg(100, 200);
		int result2 = avg(100, 200, 300);
		int result3 = avg(100, 200, 300, 400);
		//���
		System.out.println(avg(100, 200));
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(avg(1873421740, 213124, 3123123, 1231223));


	}//method ����

}//class ����
