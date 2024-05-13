package src.programmingChallenges.multithreading.example3;

// Create three threads. Ensure that the second thread starts only after the first thread ends and
// the third thread starts only after the second thread ends using the join method.
// Each thread should print its start and end along with its name.

public class MultipleThread extends Thread{

    private final int threadNumber;

    public MultipleThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread started-%d\n", Thread.currentThread().getName(), threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ended-%d\n", Thread.currentThread().getName(), threadNumber);
    }
}
