package exam03;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int isbn;
    private String title;
    private String author;
    private String publisher;

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //return isbn - o.isbn; // isbn 기준 오름차순
       // return o.isbn - isbn; // isbn 기준 내림차순
        //return (isbn - o.isbn) * -1; // 내림차순
        //return -(isbn - o.isbn); // 내림차순

        // author 기준의 오름차순
        //return author.hashCode() - o.author.hashCode();
        //return author.compareTo(o.author);

        // author 기준의 내림차순
        //return o.author.compareTo(author);
        return -author.compareTo(o.author);

    }
}
