package day03;

import java.io.IOException;

public class Hw02 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� �Է�:");
		// 65~97�빮�� 97�̻� �ҹ���
		int value = System.in.read();
		System.out.println(value);
		//���ڷ� ��� <- ascii �ڵ�� ������ ��°��� ���ڷ� �ٲپ���Ѵ�.
		char c = (char)value; //<- value�� ���� int�� value�� char�� �ٲٴ� ���� ����ȯ�� �̷������ �Ѵ�. int�� char���� ������ ��Ŀ�� ���� ����ȯ�� �̷������ �Ѵ�.
		if (value >= 65 && value < 91) {   //<- boolean type�̱� ������ �� ������ &&
			System.out.println(c + "�� �빮���Դϴ�.");
		} else if (value >= 97 && value <122) {
			System.out.println(c + "�� �ҹ����Դϴ�");
		} else if(value >=48 && value <=57) { System.out.println(value-48 + "�� �ѱ� �Ǵ� �幮�Դϴ�.");} //<-value�� ���� ȯ���� ���� 48�� ���ְ� �Ѵ�

	
	
	
	}

}
