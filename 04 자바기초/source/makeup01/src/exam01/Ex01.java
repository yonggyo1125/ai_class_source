package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        Apple apple = new Apple();
        appleBox.setItem(apple);
        Apple item = (Apple)appleBox.getItem();
        item.printInfo();


        Box grapeBox = new Box();
        Grape grape = new Grape();
        grapeBox.setItem(grape);


        Object item2 = grapeBox.getItem();
        if (item2 instanceof Apple) {
            Apple apple2 = (Apple) item; // 타입 안정성이 떨어진다!
        }
    }
}
