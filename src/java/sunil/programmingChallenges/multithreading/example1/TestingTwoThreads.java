package src.java.sunil.programmingChallenges.multithreading.example1;

//Write a program that creates two threads.
// Each thread should print "Hello from Thread X", where X is the number of the thread (1 or 2), ten times, then terminate.

public class TestingTwoThreads {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread(1);
        FirstThread t2 = new FirstThread(2);

        t1.start();
        t2.start();
    }
}
