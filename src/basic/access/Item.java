package basic.access;

public class Item {
	private String name;
	private int price;
	private int quntity;
	
	public Item(String name, int price, int quntity) {
		this.name = name;
		this.price = price;
		this.quntity = quntity;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuntity() {
		return quntity;
	}
	
	//본인 클래스 필드와 관련된 연산은 되도록 상위클래스말고 본인 클래스에서 처리
	public int getTotalPrice() {
		return price * quntity;
	}
}
