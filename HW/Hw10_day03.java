package day03;
//����� ����� ��ġ�� ���� ��ɾ�
import java.io.IOException;

public class Hw10 {//class ����
	public static void main(String[] args) throws IOException {//method ����
		//���
		System.out.println("�Է�:");
		//����� ����� ��ġ�� ���� ��ɾ�
		int value = System.in.read();
		//���ڿ����� ���� a�� value�� �������ǳ����� ����ȯ
		char a = (char) value;
		//���ڿ� ���� ���� c�� value�� �������ǳ����� ����ȯ
		char c = (char) value;
		//��µǴ� c�� ���� 32���ҽ�Ŵ
		c -= 32;
		//���ڿ� ���� ���� b�� value�� �������� ������ ����ȯ
		char b = (char) value;
		//b�� 32 ������Ŵ
		b += 32;
		//���ǹ� ���� value�� 97����ũ�ų� ���� 122���� �۰ų� ������ 
		if (value >= 97 && value <= 122) {
			//�̰� ����϶� a������ c������ ���
			System.out.println("[���]");
			System.out.println(a + "->" + c);
		//���� ������ ������Ű�� ���Ұ�� value�� 65���� ũ�ų� ���ٸ�
		} else if (value >= 65) {
			//�̰� ����϶� a������ c������ ���
			System.out.println("[���]");
			System.out.println(a + "->" + b);
		}//else�� ����

		// �Է¹��� ���ڸ� �����ȯ.
		// �Է�:a
		// [���]
		// a->A
		// �Է�:A
		// [���]
		// A->a
	}//method ����

}//class ����
