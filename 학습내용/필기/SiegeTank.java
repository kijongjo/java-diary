package day10;

//��Ű�� ����
public class SiegeTank extends Terran {// siegetankŬ����
	int ���ݷ�, ���ݼӵ�;

	// ������
	SiegeTank() {

		hp = 400;
		��Ÿ� = 7;
		���ݷ� = 20;
		���� = 0;
		���ݼӵ� = 6;

		�̵��ӵ� = 20;
	}

	// method siegemode ����
	void SiegeMode() {
		System.out.println("������ ������");
	}

	// method ���� to marine x
	void �����ϱ�(Terran x) {

		x.hp -= 30;
	}

}
