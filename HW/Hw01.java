package day03;
//����� �Է���ġ ��ɾ�
import java.io.IOException;

public class Hw01 {//class ����
	public static void main(String[] args) throws IOException {//method ����
		//�����Է� ���
		System.out.println("�����Է� :");
		//����� �Է���ġ ��ɾ�
		int value = System.in.read(); // <-ascii �ڵ� ���� �ٲ㼭 ���ڷ� ����ش�
		//value ���
		System.out.println(value);
		//value ���� 48 ���ҽ�Ŵ
		value -= 48;
		//���ҽ�Ų value���� �ٽ� ���
		System.out.println(value);
		//���� result = 3���� ���� value��
		int result = value % 3;
		//���ǹ� result�� 0�̶��
		if (result == 0) { // <-3�� ������ �������� ������   <-result ���� �ȸ���� value%3==0 ���� �ᵵ �ȴ�. ������ �켱������ ���� ��������ڰ� �켱�̱� �����̴�.
			//value�� ���
			System.out.println(value + "�� 3�� ����Դϴ�.");
		 //�װ� �ƴ϶��
		} else {
			//�̰� ���
			System.out.println(value + "�� 3�� ����� �ƴմϴ�.");
		}//���ǹ� ��

	}//method ��

}//class ��
