package exam02;

public class Box<T extends Fruit & Eatable> {
    private T item; // T는 Fruit 또는 Fruit 하위 클래스임은 알수 있다!
    //private static T item2;
    //private T[] nums = new T[];

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void print() { // T - Fruit
      // item.printInfo(); // item이 Apple, Grape인지는 알 수 없지만 Fruit 하위 클래스임은 알수 있다.
    }
}