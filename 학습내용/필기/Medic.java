package day10;

//��Ű�� ����
public class Medic extends Terran {// class ����
	// member���� ����
	int mp, ����, ȸ����, maxmp;

	// medic method ���� �Ű����� a�� b
	Medic() {
		maxmp = 100;
		maxhp = 200;
		hp = 200;
		x = 0;
		y = 0;
		mp = 100;
		���� = 0;
		ȸ���� = 8;
		��Ÿ� = 10;
		�̵��ӵ� = 10;
	}// method ����

	void �����ϱ�(Terran x) {
		System.out.println("ġ�� �����ϰڽ��ϴ�.");
		// ���� �����̶�� x�� hp�� ȸ���¸�ŭ ������ mp�� 10��ŭ �����Ѵ�
		while (true) {
			x.hp += ȸ����;
			mp -= 10;
			System.out.println("8��ŭ hp�� ġ��Ǿ����ϴ�.");
			// ���� x�� hp�� x�� maxhp�� �������� �����
			if (x.hp == x.maxhp) {
				break;
				// ���� mp==0�� �Ǹ� ���߾��
			} else if (mp == 0) {
				break;
			} // if������
		} // while�� ����
	}// method ����

	void �����ϱ�(SiegeTank x) {
		System.out.println("ġ�� �� �� ���� �����Դϴ�.");
	}

//���º��� method ����

	void ���º���() {

		System.out.println("hp:" + hp);
	}

//���ǸԱ� method ����
	void ���ǸԱ�() {

		// ���� �����̸� mp�� 20�� ������Ų��
		while (true) {
			System.out.println("������  �Һ� �Ǿ����ϴ�.");
			mp += 1;
			// ���� mp�� 200�̵Ǹ� ���߾��
			if (mp == maxmp) {
				break;
			} // if������
		} // while������
	}// method ����

}// class ����
