package HW_day09;

//package 열음
public class HandPhone {// handphone class 생성
	// 접근지정자 설정 member변수를
	private String productName;
	private String productType;
	private int price;
	private String phoneNumber;

	// 기본 생성자 설정
	HandPhone() {
		productName = "갤럭시";
		productType = "폴더폰";
		phoneNumber = "010-0000-0000";
	}

	// 매개변수를 가지는 생성자 생성
	HandPhone(String productType) {
		this();
		this.productType = productType;

	}

	// overloading을 통한 생성자 생성
	HandPhone(String productType, String phoneNumber) {
		this();
		this.productType = productType;
		this.phoneNumber = phoneNumber;
	}

	// setter method 생성 productname 변경에대한
	void setproductName(String productName) {
		this.productName = productName;
	}

	// getter method 생성 productnamd 변경에 대한
	String getproductName() { // void는 return이 없다.
		return this.productName;
	}

	// setter method 생성 procudttype 변경에 대한
	void setproductType(String productType) {
		this.productType = productType;
	}

	// getter method 생성 producttype에 대한
	String getproductType() {
		return this.productType;
	}

	// setter method 생성
	void setproductNumber(String productNumber) {
		this.phoneNumber = productNumber;
	}

	// getter method 생성
	String getphoneNumber() {
		return this.phoneNumber;
	}

	// setter method 생성
	void setprice(int price) {
		this.price = price;
	}

	// gettermethod 생성
	int getprice() {
		return this.price;
	}

	// method 생성
	void 폰울림() {
		System.out.println("띠리리리리");
	}

	// method 생성
	void 진동() {
		System.out.println("지이이잉");
	}
}// class 닫음
