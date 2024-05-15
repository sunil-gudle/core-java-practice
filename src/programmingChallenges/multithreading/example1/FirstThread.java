package src.programmingChallenges.multithreading.example1;

//Write a program that creates two threads.
// Each thread should print "Hello from Thread X", where X is the number of the thread (1 or 2), ten times, then terminate.
public class FirstThread extends Thread {

    private final int threadNumber;

    public FirstThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("(%d) %s Hello from thread %d\n", (i+1), Thread.currentThread().getName(), threadNumber);
        }
        System.out.println();
    }
}
