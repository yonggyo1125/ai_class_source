package exam04;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private int isbn;
    private String title;

    private String author; // 직렬화 배제
    private String publisher;

    //private int price;

    public Book(int isbn, String title, String author, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
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
}
