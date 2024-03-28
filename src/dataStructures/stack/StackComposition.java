package dataStructures.stack;


/**
 * StackComposition implements a stack by using a list and only exposing
 * stack behaviours.  Neat!
 *
 * @author BCIT
 * @version 2024
 */
public class StackComposition {

    private final SimpleDoublyLinkedList stackSimpleDoublyLinkedList;

    /**
     * Constructs an object of type StackComposition.
     */
    public StackComposition() {
        stackSimpleDoublyLinkedList = new SimpleDoublyLinkedList();
    }

    /**
     * Pushes the argument onto this StackComposition.
     * @param object the datum to insert
     */
    public void push(final Object object) {
        stackSimpleDoublyLinkedList.insertAtFront(object);
    }

    /**
     * Pops and returns the top of the StackComposition.
     * @return top of the Stack as an Object
     * @throws EmptySimpleDoublyLinkedListException if the StackComposition is empty
     */
    public Object pop() throws EmptySimpleDoublyLinkedListException {
        return stackSimpleDoublyLinkedList.removeFromFront();
    }

    /**
     * Returns true if the StackComposition is empty.
     * @return true if empty, else false
     */
    public boolean isEmpty() {
        return stackSimpleDoublyLinkedList.isEmpty();
    }

    /**
     * Prints the StackComposition.
     */
    public void print() {
        stackSimpleDoublyLinkedList.print();
    }
}
