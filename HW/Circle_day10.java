package HW_day10;

public class Circle_day10 extends Figure {
	int r;
   
	// setCalArea method�� ���������� ���.
	// �׷��� ���� class�� ����
	// �׷��� �Ű������� {}�ȿ� ���� ���� ���� �ٸ��� ���� class�� ����ִ� setCalArea method�� �߻�ȭ ���Ѽ� �Ű�������
	// {}�ȿ� ���� ���� ���� class���� ���� �����ϱ�� �����
	//������ �߻� class���� ()���� �Ű������� �������־�� �Ѵ�. ������ �� �ִ� ���� {} ���̱� ���� overriding�� ���ؼ� ()���� �Ű����� ������ ���� ã�� �ĺ��� �Ŀ� ���� �����̴�. 
	void setCalArea(int r) {
	���� = (double)3.14 * r * r;

	}

	@Override
   double getCalArea() {
		
		return this.����;
	}
     


}
