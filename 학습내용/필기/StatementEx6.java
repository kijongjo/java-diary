package day03;
//system.in.read�� ����ϱ� ���� �ɼ�
import java.io.IOException;

//���α׷��� �������� ������ ���������� �����ϰ� ���� �� �ְ� �׷��� ����� �ִ� .
// ���- ���Ǻб⹮: Ư�� ���ǿ� ���� �ٸ� ������ �����Ű�����Ҷ�
// if(����) {
//	 ����1;
//	 ����2;
//                              <-Ư�� ������ �����ϸ� {}���� ����1,2�� �����Ѵ� .
// }else if(����){               <-if������ �������� �ʴ´ٸ� else�� if������ �����ϴ��� ���� {}����3,4�� �����Ѵ�.
//  ����3;
//  ����4;
// }else{                       <-else if�� �������� �ʴ´ٸ� else�� {} ���� 5,6�� �����Ѵ�.      
//  ����5;
//  ����6;
//}
public class StatementEx6 {// main method ����      
                                          //sysout in �� ����ϱ����� �ɼ�
	public static void main(String[] args) throws IOException {

		System.out.print("���� �Է�:");
		//������������ġ�� ���� ��ɾ�
		int value = System.in.read();
		System.out.println(value);
		//�־��� value�� 48�� ���� 
		value-=48;
		 System.out.println(value);
		 //���� result�� �־��� value����2�� ���� ���������̴�.
		 int result = value%2;                         //<-value���� 2�� ���� ������ ��
		 //���ǹ� ���� result�� 0�� ������
		 if(result == 0) {                             //<-result=0�� �����̶� x
			 //�̰� ���  
			 System.out.println(value + "�� ¦��");
		 //�׷��� �ʴٸ�
		 }else{
			 //�̰���� 
			 System.out.println(value+"�� Ȧ��");
		 }//if������
		// TODO Auto-generated method stub
		// value ==>����
		//value -=48; //<-���� �Է��� ������ �ƽ�Ű�ڵ忡�� ���� ���°�
		//System.out.println(value + "�� ¦��");
		//System.out.println(value + "�� Ȧ��");/*
		 /* ������ �����ϰԵǸ� ¦��Ȧ�� �ΰ��� ���´�.
		 * 
		 * if���� ���� ¦���� ¦���� ��� Ȧ���� Ȧ���� ����ϰ� �ؾ��Ѵ�.
		 */
       
	}//method ����

}//class ����



