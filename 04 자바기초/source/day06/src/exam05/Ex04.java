package exam05;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book(1000, "책1", "저자1", "출판사1");
        Book b2 = new Book(1000, "책1", "저자1", "출판사1");

        System.out.printf("b1 == b2: %s, b1.equals(b2): %s%n", b1 == b2, b1.equals(b2));
    }
}
