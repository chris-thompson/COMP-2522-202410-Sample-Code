package generics;

/**
 * Tests the Stack.
 *
 * @author BCIT
 * @version 2024
 */
public class StackTest {

    private final double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    private final int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Stack<Double> doubleStack;
    private Stack<Integer> integerStack;

    /**
     * Tests the Stack methods.
     */
    public void testStacks() {
        final int stackSize = 10;
        doubleStack = new Stack<>(stackSize);
        integerStack = new Stack<>(stackSize);

        testPushDouble();
        testPopDouble();
        testPushInteger();
        testPopInteger();
    }

    /**
     * Tests the Stack push method.
     */
    public void testPushDouble() {
        try {
            System.out.println("\nPushing elements onto doubleStack");
            for (double element : doubleElements) {
                System.out.printf("%.1f ", element);
                doubleStack.push(element);
            } // end for
        } catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    /**
     * Tests the Stack pop method.
     */
    public void testPopDouble() {
        try {
            System.out.println("\nPopping elements from doubleStack");
            double popValue;
            while (true) { // Terrible idea!
                popValue = doubleStack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    /**
     * Tests the Stack push method.
     */
    public void testPushInteger() {
        try {
            System.out.println("\nPushing elements onto integerStack");

            for (int element : integerElements) {
                System.out.printf("%d ", element);
                integerStack.push(element);
            }
        } catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        }
    }

    /**
     * Tests the Stack pop method.
     */
    public void testPopInteger() {
        try {
            System.out.println("\nPopping elements from integerStack");
            int popValue;
            while (true) {
                popValue = integerStack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        StackTest application = new StackTest();
        application.testStacks();
    }
}
