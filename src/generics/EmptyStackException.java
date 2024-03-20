package generics;


/**
 * EmptyStackException is raised when a pop operation is attempted on an empty
 * stack.
 *
 * @author BCIT
 * @version 2024
 */
public class EmptyStackException extends RuntimeException {

    /**
     * Create an object of type EmptyStackException.
     *
     * @param message a String message
     */
    public EmptyStackException(final String message) {
        super(message);
    }

}
