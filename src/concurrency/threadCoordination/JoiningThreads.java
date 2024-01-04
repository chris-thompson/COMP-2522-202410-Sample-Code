package concurrency.threadCoordination;

import java.math.BigInteger;

/**
 * <p>We can use the join() method to wait for a thread to finish. That is, it waits for the thread's run method
 * to complete. We can also specify a timeout value for the join() method. If the thread does not finish within
 * the specified timeout, the join() method returns and the program continues.
 * </p>
 * <p>
 * This lets us run tasks in parallel and then safely and correctly aggregate the results. Neat!
 * </p>
 *
 * @author BCIT
 * @version 2024
 */
public final class JoiningThreads {

    private JoiningThreads() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        // When I execute the next line of code on my 2018 MacBook Pro which has a 6-core
        // Intel Core i9 processor, the program prints 12. That's because the processor
        // supports hyper-threading, which means that each core can run two threads at the
        // same time. You may learn more about this in architecture or OS courses.
        // What about your laptop?
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);
    }

    private static final class FactorialThread extends Thread {
        private final long inputNumber;
        private BigInteger result;
        private boolean isFinished;

        FactorialThread(final long inputNumber) {
            this.inputNumber = inputNumber;
            this.result = BigInteger.ZERO;
            this.isFinished = false;
        }

        @Override
        public void run() {
            this.result = factorial(inputNumber);
            this.isFinished = true;
        }

        public BigInteger factorial(final long operand) {
            BigInteger tempResult = BigInteger.ONE;
            for (long i = operand; i > 0; i--) {
                tempResult = tempResult.multiply(new BigInteger((Long.toString(i))));
            }
            return tempResult;
        }

        public BigInteger getResult() {
            return result;
        }

        public boolean isFinished() {
            return isFinished;
        }
    }
}
