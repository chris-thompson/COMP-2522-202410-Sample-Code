package dataStructures.stack;

/**
 * StackInheritance implements a stack by extending the
 * SimpleDoublyLinkedList and only exposing stack behaviours.  Neat!
 *
 * @author BCIT
 * @version 2024
 */
public class StackInheritance extends SimpleDoublyLinkedList {

    /**
     * Creates an object of type StackInheritance.
     */
    public StackInheritance() {
        super();
    }

    /**
     * Pushes the argument onto this StackInheritance.
     * @param object the datum to insert
     */
    public void push(final Object object) {
        insertAtFront(object);
    }

    /**
     * Pops and returns the top of the StackInheritance.
     * @return top of the Stack as an Object
     * @throws EmptySimpleDoublyLinkedListException if the Stack is empty
     */
    public Object pop() throws EmptySimpleDoublyLinkedListException {
        return removeFromFront();
    }
}
