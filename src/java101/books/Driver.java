package java101.books;

/**
 * Tests the Book class.
 *
 * @author BCIT
 * @version 2024
 */
public final class Driver {

    private Driver() { }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        final Book myBook = new Book();
        System.out.println(myBook);

        final Book anotherBook = new Book("Homer", "Iliad", 700);
        System.out.println(anotherBook);

    }
}
