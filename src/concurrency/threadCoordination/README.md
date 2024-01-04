## Welcome to concurrency!

We often want to stop threads for one of the following reasons:

1. clean up resources being used by a finished thread
2. stop a thread that is misbehaving
3. stop a thread that is taking too long
4. stop a thread that is blocked:
    1. waiting for a condition that may never occur
    2. waiting for a resource that may never become available
    3. waiting for a lock that may never be released.

###  In this package, the source files introduce:

1. how to interrupt threads that are blocking the program from ending or continuing
2. how to use the `join()` method to wait for a thread to finish

###  Study the files in this order:

1. BlockingProblem.java
2. BlockingSolution.java
3. Interrupt.java
4. DaemonThreadDemo.java
5. JoiningThreads.java
