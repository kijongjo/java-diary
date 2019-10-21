package day06;

public class Hw06_day06 {
	static int plus(int x, int y) {
		return x + y;
	}

	static float plus(int x, float y, int z) {
		float c = (float) x + y + (float) z;
		return c;
	}

	static double plus(int x, double y, int z) {

		return (double) x + y + (double) z;
	}

	public static void main(String[] args) {

		int result1 = plus(100, 400);

		float result2 = plus(100, 200.0f, 300);

		double result3 = plus(100, 300.0, 200);

		System.out.println(result3);
	}

}
