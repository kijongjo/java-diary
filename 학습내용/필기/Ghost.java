package day10;

public class Ghost extends Terran {// Ghost class ����

	Ghost(int a) {// ghost ������
		maxhp = a;
		hp = a;
		��Ÿ� = 10;
		���ݷ� = 10;
		���� = 0;
		���ݼӵ� = 10;
		x = 0;
		y = 0;
	}// ghost ������ ����

	// METHOD �ٹ̻��� �߻�
	void �ٹ̻��Ϲ߻�() {
		System.out.println("Ghost : �� �̻����� �߻� �Ǿ����ϴ�.");
	}

	// ���� TO MARINE
	void �����ϱ�(Terran x) {

		x.hp -= 10;

	}

}
