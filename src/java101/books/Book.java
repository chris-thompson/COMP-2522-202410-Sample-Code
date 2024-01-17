package java101.books;

/**
 * Represents a book.
 *
 * @author BCIT
 * @version 2024
 */
public class Book {

    /**
     * Default author name.
     */
    public static final String DEFAULT_AUTHOR = "Jane Doe";

    /**
     * Default title.
     */
    public static final String DEFAULT_TITLE = "The Book";

    /**
     * Default number of page.
     */
    public static final int MINIMUM_PAGES = 0;

    private final String author;
    private final String title;
    private final int pages;

    /**
     * Constructs an object of type Book.
     */
    public Book() {
        this(DEFAULT_AUTHOR, DEFAULT_TITLE, MINIMUM_PAGES);
    }

    /**
     * Constructs an object of type Book.
     *
     * @param author a String
     * @param title  a String
     */
    public Book(final String author, final String title) {
        this(author, title, MINIMUM_PAGES);
    }

    /**
     * Constructs an object of type Book.
     *
     * @param author a String
     * @param title  a String
     * @param pages  a positive int
     */
    public Book(final String author, final String title, final int pages) {
        this.author = author;
        this.title = title;
        this.pages = Math.max(pages, MINIMUM_PAGES);
    }

    /**
     * Returns the number of pages as an int.
     *
     * @return pages as an int
     */
    public int getPages() {
        return pages;
    }

    /**
     * Returns the author as a String.
     *
     * @return author as a String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the title as a String.
     *
     * @return title as a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns a String representation of this object.
     *
     * @return description as a String.
     */
    @Override
    public String toString() {
        return "Book{"
                + "author='"
                + author + '\''
                + ", title='" + title + '\''
                + ", pages=" + pages + '}';
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        final int quantity = 10;
        for (int i = 0; i < quantity; ++i) {
            System.out.println(new Book());
        }
    }
}
