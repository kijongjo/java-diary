package day03;

import java.io.IOException;

public class Hw01 {
	public static void main(String[] args) throws IOException {
		System.out.println("�����Է� :");
		int value = System.in.read(); // <-ascii �ڵ� ���� �ٲ㼭 ���ڷ� ����ش�
		System.out.println(value);
		value -= 48;
		System.out.println(value);
		int result = value % 3;
		if (result == 0) { // <-3�� ������ �������� ������   <-result ���� �ȸ���� value%3==0 ���� �ᵵ �ȴ�. ������ �켱������ ���� ��������ڰ� �켱�̱� �����̴�.
			System.out.println(value + "�� 3�� ����Դϴ�.");
		} else {
			System.out.println(value + "�� 3�� ����� �ƴմϴ�.");
		}

	}

}
