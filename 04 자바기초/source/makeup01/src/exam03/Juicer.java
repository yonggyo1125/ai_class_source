package exam03;

import java.util.ArrayList;
import java.util.List;

public class Juicer {
    /**
     * <?>  -> <? extends Object>
     * @param items
     */
    public static void make(FruitBox<? extends Fruit> items) {
        List<Fruit> fruits = (List<Fruit>)items.getItems();
        for (Fruit fruit : fruits) {
            fruit.printInfo();
        }
    }
    /*
    public static void make(FruitBox<Apple> items) {
        List<Apple> fruits = items.getItems();
        for (Apple fruit : fruits) {
            fruit.printInfo();
        }
    }
    */
    /*
    <Grape>, <Apple> 문법적 오류!
    컴파일시에는 이 부분이 제거 -> FruitBox items
     메서드의 중복 정의로 오류가 발생
     지네릭 메서드의 타입은 함수가 호출되었을때 결정, 매개변수의 자료형
     반환값 종류
    public static void make(FruitBox<Grape> items) {

    }*/
}
