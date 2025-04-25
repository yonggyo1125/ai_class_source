package exam03;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleItems = new FruitBox<>();
        appleItems.add(new Apple());
        appleItems.add(new Apple());
        appleItems.add(new Apple());

        Juicer.make(appleItems);

        FruitBox<Grape> grapeItems = new FruitBox<>();
        grapeItems.add(new Grape());
        grapeItems.add(new Grape());
        grapeItems.add(new Grape());

        Juicer.make(grapeItems);

        //Juicer.<Apple>make3(appleItems);
        Juicer.make3(appleItems);
    }
}
