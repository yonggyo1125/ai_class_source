package exam01;

import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        Random random = new Random();
        //random.ints().limit(10).forEach(System.out::println);
        random.ints(10).forEach(System.out::println);
    }
}
