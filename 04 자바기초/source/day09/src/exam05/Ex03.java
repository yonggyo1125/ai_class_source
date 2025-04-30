package exam05;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class Ex03 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn(1000);

        //ToIntFunction<Book> func = x -> x.getIsbn();
        //ToIntFunction<Book> func = Book::getIsbn;
        //ToIntFunction<Book> func =
        IntSupplier func = book::getIsbn;
    }
}
