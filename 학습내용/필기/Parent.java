package day10;
//��Ű�� ����
public class Parent {//parent class ����
	//member���� ����
	String name, job;
	int age;
    //�⺻ ������ ����
	Parent() {
		name = "�θ��";
		age = 50;
		System.out.println("�θ� ������");
	}
     //�Ű������ִ� ������ ����
	 Parent(String �̸�) {
		this.name = �̸�;
	}
    //method ��� �߰�
	public void �Ա�() {
		System.out.println("���� �͸� �Ա�");
	}
    //method ��� �߰�
	public void �ڱ�() {
		System.out.println("�ڱ�");
	}
    //method ��� �߰� 
	public void �ܼҸ��ϱ�() {
		System.out.println("�ܼҸ�");
	}
   //method ��� �߰� 
	public void �뷡�θ���() {
		System.out.println("�뷡�θ���");
	}

	
	
	
	
	
}//class ����
//class �����Ҷ� name�Ʒ� modifiers�� ����
//public package(=default)�� �ִ�. 
//superclass:�θ� Ŭ������ ���Ѵ�.
//java.lang.Object <-java.�� package class�� ��� ������ Object�̴�.