package day03;
//����� ����� ��ġ�� ���� ��ɾ�
import java.io.IOException;

// ����ڷκ��� ���� �Է¹޴� ��� ù��°
// ȭ�� ��� system.out. <-����� ǥ�������ġ
// ǥ���Է���ġ system.in <-Ű����  ǥ���Է���ġ�� 
// System.in.read(); <- ǥ���Է���ġ�κ��� ���� �Է¹޾� ��������.
// ^���� ���� ���� ���ؼ� 1.pakage �Ʒ��� import java.io.IOException;�� �Է�      2.main method�� throws IOException�� �Է� 
public class StatementEx5 {//class ����

	public static void main(String[] args)throws IOException {//method ����
		// TODO Auto-generated method stub
        //����ڷκ��� ���� �Է� �޾Ƽ� ���
		System.out.print("���?:");
		//ǥ���Է���ġ�κ��� ���� �Է¹޾� ��������
		int dan =System.in.read();
		//0:48,A:65, a:97
		System.out.println("����ڰ� �Է��Ѱ�:"+dan);
		// ����� ������ â�� ���� ���� �Է��ϰ� �Ǹ� ����ڰ� �Է��� ���� ascii�ڵ� ������ �����Եȴ� .
		dan -=48; // 0�� ascii�ڵ�:48�̹Ƿ� 

		
		//�ݺ��� i�� 1���ͽ��� i�� 9���� �۰ų� ���� 1������
		for(int i =1;i<=9;i++) {
			//���
			System.out.println(
					dan+"*"+i+"="+dan*i );
			
		}// for�� end
		
	}// main method end

}//class end

// ���� ������ pakage���� pakage �̸��� ���� ������� ���� ��Ű���� ����� ������� �װ��� ���ϰ� �ȴ�.
// �Ʒ��κп� main method ��ɾ üũ�ϸ� �����Ҷ� �̸� main method�� ������ ���´�.