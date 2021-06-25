package spring_introduction_3;

public class Library {

    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void giveNeedBook() {
        System.out.println("Thank you, your book is about ");
        book.give();
    }
}
