package exam05;

import exam01.A;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human();
        //human.move();

        Tiger tiger = new Tiger();
        //tiger.move();

        Bird bird = new Bird();
        //bird.move();

        Animal[] animals = new Animal[3];
        animals[0] = human; // Animal animals[0] = new Human()
        animals[1] = tiger;
        animals[2] = bird;

        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Human h1) {
               // Human h1 = (Human) animal;
                h1.reading();
            }
        }

    }
}
