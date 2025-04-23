package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order(); // Order, Buyer, Seller

        Buyer buyer = order;
        buyer.buy();

        Seller seller = order;
        seller.sell();


        order.order(); // Order::order();
    }
}
