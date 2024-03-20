package generics;


/**
 * FullStackException is raised when a push operation is attempted on a full
 * stack.
 *
 * @author BCIT
 * @version 2024
 */
public class FullStackException extends RuntimeException {

    /**
     * Create an object of type FullStackException.
     *
     * @param exception a String message
     */
    public FullStackException(final String exception) {
        super(exception);
    }
}
