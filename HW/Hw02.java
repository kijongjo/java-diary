package day03;
//����� �������ġ ��ɾ�
import java.io.IOException;

public class Hw02 {//class����
	public static void main(String[] args) throws IOException {//method����
		//�����Է� ���
		System.out.println("���� �Է�:");
		// 65~97�빮�� 97�̻� �ҹ���
		//����� ����� ��ġ ��ɾ�
		int value = System.in.read();
		//value ���
		System.out.println(value);
		//���ڷ� ��� <- ascii �ڵ�� ������ ��°��� ���ڷ� �ٲپ���Ѵ�.
		//���ڷ� ��� value���� ����ȯ��Ŵ 
		char c = (char)value; //<- value�� ���� int�� value�� char�� �ٲٴ� ���� ����ȯ�� �̷������ �Ѵ�. int�� char���� ������ ��Ŀ�� ���� ����ȯ�� �̷������ �Ѵ�.
		//���ǹ� value�� 65 �׸��� value�� 91 ���� 
		if (value >= 65 && value < 91) {   //<- boolean type�̱� ������ �� ������ &&
			// ���ǿ� ������ �̰� ���
			System.out.println(c + "�� �빮���Դϴ�.");
		 //���ǿ� �ȸ����� value�� 97�׸��� 122���̿���
		} else if (value >= 97 && value <122) {
			//�̰� ����϶�
			System.out.println(c + "�� �ҹ����Դϴ�");
		//�ι�° ������ �ȸ����� value���� 48���� 57���ǿ����� �̰� ����϶�.
		} else if(value >=48 && value <=57) { System.out.println(value-48 + "�� �ѱ� �Ǵ� �幮�Դϴ�.");} //<-value�� ���� ȯ���� ���� 48�� ���ְ� �Ѵ�

	
	
	
	}//method ����

}//class ����
