package exam06;

public interface Buyer {
    void buy();

    default void order() { // public
        System.out.println("Buyer - 주문하기");
    }

}
