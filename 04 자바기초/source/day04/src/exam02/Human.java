package exam02;

public final class Human extends Animal {

    @Override
    public void move() {
        //super.move(); // Animal::move()

        System.out.println("두발로 직립보행!");
    }

    public final void reading() {
        System.out.println("독서를 한다.");
    }
}
