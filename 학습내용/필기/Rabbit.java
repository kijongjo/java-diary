package day10;
//��Ű�� ����
public class Rabbit extends ������ {//�������� ��Ӱ����� rabbit
    //rabbit �⺻ ������
	Rabbit() {
		�� = 2;
		�� = 1;
		�� = 1;
		�� = 2;
		���� = 1;
		ǰ�� = "�Ӱ��";
		�̸� = "�����";
	}
   //method 
	public void ����() {
		System.out.println("���� ");

	}
	//���� class�� �߻� method�� ���� ��� ���� ���� 
	@Override
	public void �Ա�() {
		System.out.println("���");

	}
	//���� class�� �߻� method�� ���� ��� ���� ����.
	@Override
	public void �ڱ�() {
		System.out.println("����");
	}
}//class ����
