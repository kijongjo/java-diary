package day09;
import day08.Marine;
//�����ϰ� ��ü�� ����� ���
//������ ���� �������� ���ϵ��� �ϰ�����.
//���� ����� ������ �޼��带 ���ؼ� �۾��� �ϰ� �����.
//setXXX(); : SETTER METHOD
//GETXXX(); : GETTER METHOD�� �Ѵ�.// ���������� ���� BALANCE�� ���� ���ϰ� ����� ������ ��Ʈ�� ���Խ�Ű�� ���
public class TestMain3 {//class testMain3 ����
	public static void main(String[] args) {//main ����
        //���ο� ��ü ���� instance ������
		ATM atm = new ATM();
        //atm ��ü�� deposit��� 10000�� �߰�.
		atm.deposit(10000);
		// 20�� �̻��� �־������ overflow�� �Ͼ������.
		// 2100000000�� �Ա��մϴ�.
		// ���� �ܾ�: -189934592
		//atm.balance = 99999; ������ ���� ���� ���ϰ� �ϵ��� �ϱ� ���� setBalance�� getBalance�� ����Ѵ�
		//atm��ü�� ĸ������� ���� setter 50000�Ա� 
		atm.setBalance(50000);
		//ĸ�� ������ ���� ���ϴ� ������ getter�� ���
		System.out.println("���� �ܾ� ��ȸ: "+atm.getBalance());
		//atm��ü���� 100���
		atm.withDraw(100);
        //���� ��ü ����  
		Marine Marine1 = new Marine();  //day08�� Marine�����ڿ�  pubilc
	    //atm��ü �̸��� �����ϱ� 
		atm.setName("������");
	    //getter�� ���� ���
		System.out.println(atm.getName());
	
	}

}
