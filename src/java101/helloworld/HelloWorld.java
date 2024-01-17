package java101.helloworld;

/**
 * HelloWorld.
 *
 * @author BCIT
 * @version 2024
 */
public final class HelloWorld {

    private HelloWorld() {

    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {

        final String message = "Hello world!";
        System.out.println(message);

        String emptyString = "";
        System.out.println(emptyString);

        String anotherString = new String("George wuz here");
        System.out.println(anotherString);

        Integer thisIsAWrapper = new Integer(2); // What does "deprecated" mean?
        Integer thisIsAnotherWrapper = 2;
        System.out.println(thisIsAWrapper + ", " + thisIsAnotherWrapper);

        String noString = null;
        System.out.println(noString);
        noString = "I have a value now";
        System.out.println(noString);

        final int number = 5;
        // number = 7;
        System.out.println(number);

        int anotherNumber = 5;
        anotherNumber *= anotherNumber;
        System.out.println(anotherNumber);

        double value = 0.0;
        System.out.println(value);

        for (int i = 0; i < anotherNumber; i++) {
            System.out.println("Welcome");
        }

    }
} // end of the class
