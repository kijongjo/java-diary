package day09;
//��Ű�� ����
public class GuGuDan {//class ����
// ��������
	int dan;
    //������ ���� 
	GuGuDan(int dan) {
		this.dan = dan;
	}//������ ����

	//method ����
	void print() {
		//������
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}//for�� ����

	}//method ����

}//class ����
