package spring_introduction_3;

public class Test {

    public static void main(String[] args) {

        Book book = new Fairytale();
        Library library = new Library(book);

        library.giveNeedBook();
    }
}
