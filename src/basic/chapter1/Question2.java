package basic.chapter1;

public class Question2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
        ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
        ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        int totalPrice = 0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.getProductName() + ", 가격: " + productOrder.getPrice() + ", 수량: " + productOrder.getQuantity());
            totalPrice +=  productOrder.getPrice() * productOrder.getQuantity();
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
