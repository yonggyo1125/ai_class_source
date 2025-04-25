package exam09;

public class Order implements Buyer, Seller{
    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void order() {
        //System.out.println("Order - 주문하기");
        //Buyer.super.order();
        Seller.super.order();
    }
}
