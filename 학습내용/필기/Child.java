package day10;
//��Ű�� ���� 
public class Child extends Parent {//child�� parent ��Ӱ��� ���� 
	//�ڽ��� member ���� 
	String facebookID;
     ///�⺻������ ���� 
	Child() {
		//�θ��� �⺻������ �ҷ�����
		super();
		//�ڽĿ��Ը� �ִ� Ư¡ �߰�
		facebookID = "al";
		System.out.println("���Ű����� ������ ȣ��");
	}

	//Ŭ������ method �߰� 
	public void Ŭ������() {
		System.out.println("�ε�ĩ");
	}//method ����

	@Override // compiler���� ��ӹ޴°� �´��� Ȯ���� �ش޶�� ���̴�. ������ ������ �߻��Ѵ�.
	// ���� override�ߴµ� �θ��� �뷡�θ��� ����� �ٲٰ������ �뷡�θ��ڷ� �Ǽ��� �ٲٰ� �Ǿ� �뷡�θ��⸦ ȣ���ص� �θ� ����� ȣ��Ǵ�
	// �һ�簡 �߻�.
	// �װ��� �������� override ǥ�ø��ϰ� �뷡�θ��� �̸��� �뷡�θ��ڷ� �ٲ�� �Ǹ� ������ �߻��ϵ��� ���´�.
	//�θ� �����ڿ� �ִ� �뷡�θ��� method�� ��ġ�� override�� ���� ���� ����.
	public void �뷡�θ���() {
		System.out.println("�� ���� ���� ����~");
	
	
	}//methdoD ����
	public void ���º���() {System.out.println(facebookID);}
}//class ���� 
