package concurrency.threadInheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * How might we organize a collection of Threads to be executed concurrently?
 *
 * @author BCIT
 * @version 2024
 */
public final class MultiExecutor {

    private final List<Runnable> tasks;

    /**
     * Constructs an object of type MultiExecutor.
     * @param tasks a list of Runnable objects  to be executed concurrently
     */
    public MultiExecutor(final List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Executes all the tasks concurrently.
     */
    public void executeAll() {
        List<Thread> threads = new ArrayList<>(tasks.size());

        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
