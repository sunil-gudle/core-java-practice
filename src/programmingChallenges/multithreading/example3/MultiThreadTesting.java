package src.programmingChallenges.multithreading.example3;

public class MultiThreadTesting {
    public static void main(String[] args) throws InterruptedException {
        MultipleThread t1 = new MultipleThread(1);
        MultipleThread t2 = new MultipleThread(2);
        MultipleThread t3 = new MultipleThread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
