package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Human(),
                new Tiger(),
                new Bird()
        };

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
