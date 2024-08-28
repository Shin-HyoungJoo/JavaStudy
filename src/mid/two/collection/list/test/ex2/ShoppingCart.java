package mid.two.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> list = new ArrayList<>();

	public void addItem(Item item) {
		// TODO Auto-generated method stub
		list.add(item);
	}

	public void displayItems() {
		// TODO Auto-generated method stub
		int TotalPrice = 0;
		System.out.println("장바구니 상품 출력");
		for (Item item : list) {
			System.out.printf("상품명:%s, 합계:%d", item.getName(), item.getTotalPrice());
			System.out.println();
			TotalPrice += item.getTotalPrice();
		}
		System.out.printf("전체 가격 합:%d",TotalPrice);
	}

}
