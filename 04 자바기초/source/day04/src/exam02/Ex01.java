package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Animal
        human.move();

        Animal tiger = new Tiger(); // Tiger, Animal
        tiger.move();

        Animal bird = new Bird(); // Bird, Animal
        bird.move();

        Animal[] animals = new Animal[3];
        animals[0] = human; // Animal animals[0] = new Human();
        animals[1] = tiger;
        animals[2] = bird;

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
