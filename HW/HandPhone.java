package HW_day09;

//package ����
public class HandPhone {// handphone class ����
	// ���������� ���� member������
	private String productName;
	private String productType;
	private int price;
	private String phoneNumber;

	// �⺻ ������ ����
	HandPhone() {
		productName = "������";
		productType = "������";
		phoneNumber = "010-0000-0000";
	}

	// �Ű������� ������ ������ ����
	HandPhone(String productType) {
		this();
		this.productType = productType;

	}

	// overloading�� ���� ������ ����
	HandPhone(String productType, String phoneNumber) {
		this();
		this.productType = productType;
		this.phoneNumber = phoneNumber;
	}

	// setter method ���� productname ���濡����
	void setproductName(String productName) {
		this.productName = productName;
	}

	// getter method ���� productnamd ���濡 ����
	String getproductName() { // void�� return�� ����.
		return this.productName;
	}

	// setter method ���� procudttype ���濡 ����
	void setproductType(String productType) {
		this.productType = productType;
	}

	// getter method ���� producttype�� ����
	String getproductType() {
		return this.productType;
	}

	// setter method ����
	void setproductNumber(String productNumber) {
		this.phoneNumber = productNumber;
	}

	// getter method ����
	String getphoneNumber() {
		return this.phoneNumber;
	}

	// setter method ����
	void setprice(int price) {
		this.price = price;
	}

	// gettermethod ����
	int getprice() {
		return this.price;
	}

	// method ����
	void ���︲() {
		System.out.println("�츮������");
	}

	// method ����
	void ����() {
		System.out.println("��������");
	}
}// class ����
