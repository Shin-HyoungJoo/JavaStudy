package basic.access;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemCount;

	public ShoppingCart() {
		itemCount = 0;
	}

	public void addItem(Item item) {
		if (isCountVaild()) {
			items[itemCount] = item;
			itemCount++;
		} else {
			System.out.println("장바구니가 가득 찼습니다.");
		}
	}

	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		int totalPrice = 0;
		for (int i = 0; i < itemCount; i++) {
			int sumPrice = items[i].getTotalPrice();
			System.out.println("상품명:" + items[i].getName() + ", 합계:" + sumPrice);
			totalPrice += sumPrice;
		}
		System.out.println("전체 가격 합:" + totalPrice);
	}

	private boolean isCountVaild() {
		return itemCount < items.length - 1;
	}
}
