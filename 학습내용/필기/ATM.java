package day09;

public class ATM {// public �� �ƹ� package������ ���� �ִ�.
	// private int balance;//�� ���ϳ������� ���� �����ϴ�. �� �̿��� ���� ����������.
	private int balance;
	// private ���� : ������ �ʵ��� ����� �����տ� ���־� ���� ��ȣ�ϴ� ���� (���� ������,���� ������ , ���� ������.)
	private String name; // �ƹ��͵� ���������� �⺻���� default�̴�.
	String accoutNo; // ��𼭺��� �󸶳� ������ �� �ִٴ� ���� ���ִ� ���̴�.
							
    public String getName() {
       return this.name;
    }
	public void setName(String name){
		//�ٷ� ���Խ�Ű�°� �ƴ� ���������δ� ���ǹ����� ���� �Է��� ����� ������ �ִ��� ������ Ȯ�����Ŀ� ��ȯ�� ������ �����ϰ� �ȴ�. 
		this.name=name;
	}
    
	public int getBalance() {
		// ��������� ���� �����Ѵ�.
		return this.balance;
	}

	// ���� �����Ѵ�. : setBalance(5000);
	public void setBalance(int balance) {
		//���� �ִ���?
		// ����� ����� . 
		this.balance = balance;

	}

	
	// ���� private:���� Ŭ���������� ���ٰ���
	// default:���� Ŭ������ ���� ��Ű�������� ���� ����
	// �Ա� //protected: ���� package�� ��Ӱ��迡 �ִ� �͵鸸 ��밡���ϴ�
	void deposit(int a) { // public:��𿡼��� ���� �����ϴ�. ���� �� 4������ �����Ѵ�.
							// *import�� ���� package���� ã�°Ծƴ� �ٸ� package���� ã���� �ϴ°�.
		balance += a; // �Ųٷ� public�� ������ ���ָ� IMPORT�� ���� ���� �ʿ䰡 ����.
		System.out.println(a + "�� �Ա��մϴ�.");
		System.out.println("���� �ܾ�: " + balance);

	}

	// ���
	void withDraw(int a) {
		if (balance >= a) {
			balance -= a;
			System.out.println(a + "�� ����մϴ�");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		System.out.println("���� �ܾ�:" + balance);

	}

}
