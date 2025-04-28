package exam01;

public class Book {
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자
    private String publisher; // 출판사

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
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

    /**
     * 동등성 비교, 동등성은 가치 판단이 필요!
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
