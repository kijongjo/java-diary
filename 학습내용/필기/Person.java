package day09;

/**
 * @author JHTA
 *
 */
public class Person {

	String �̸�;
	String ����;
	String ����;
	int ����;
	float ������;
	float Ű;

	// �⺻ ������ ,return���� ���� class��� �����ϴ�.

	Person() {
		�̸� = "������";
		���� = "����";
		���� = "��";
		���� = 26;
		������ = 50.42f;
		Ű = 168.5f;
		System.out.println("Person �⺻������");
	}

	// �Ű����� �ִ� ������
	Person(String �̸�, String ����, float ������, float Ű) {
		this.�̸� = �̸�;
		this.���� = ����;
		
		
		this.������ = ������;
		this.Ű = Ű;

	}

	public void �Ա�() {
		System.out.println("�ȳ�");
	};

	public void ���ڱ�() {
		System.out.println("Zzz..");
	};

	public void ����() {
		System.out.println("��í");
	};

}
