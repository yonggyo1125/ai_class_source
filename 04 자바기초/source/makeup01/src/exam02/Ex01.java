package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
        Apple apple = appleBox.getItem(); // 형변환의 번거로움 X
        appleBox.print();


        //appleBox.setItem(new Grape()); // 오류 - 타입 안정성이 확보

        //Box<Toy> toyBox = new Box<Toy>();
        //toyBox.setItem(new Toy());
    }
}
