package generics;

/**
 * A simple Stack parameterized over E.
 *
 * @param <E> the data type
 * @author BCIT
 * @version 2024
 */
public class Stack<E> {

    private static final int DEFAULT_SIZE = 10;

    // number of elements in the stack
    private final int size;

    // location of the top element
    private int top;

    // array that stores stack elements
    private final E[] elements;

    /**
     * Constructs a Stack of size DEFAULT_SIZE.
     */
    public Stack() {
        this(DEFAULT_SIZE);
    }

    /**
     * Constructs a Stack of the specified size.
     *
     * @param size a positive non-zero integer.
     */
    public Stack(final int size) {
        if (size > 0) {
            this.size = size;
        } else {
            this.size = DEFAULT_SIZE;
        }
        top = -1;
        elements = (E[]) new Object[this.size];
    }

    /**
     * Pushes the specified element onto the Stack.
     * @param pushValue the element to push
     * @throws FullStackException if the Stack is already full
     * */
    public void push(final E pushValue) {
        if (top == size - 1) {
            throw new FullStackException(
                    String.format("Stack is full, cannot push %s", pushValue));
        }

        elements[++top] = pushValue; // place pushValue on Stack
    }

    /**
     * Returns the top element if not empty, else throws an
     * EmptyStackException.
     * @return the top element
     * @throws EmptyStackException if the Stack is empty
     */
    public E pop() {
        if (top == -1) {
            throw new EmptyStackException("Stack is empty, cannot pop");
        }

        return elements[top--]; // remove and return top element of Stack
    }
}
