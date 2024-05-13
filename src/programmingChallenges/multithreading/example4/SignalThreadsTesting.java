package src.programmingChallenges.multithreading.example4;

public class SignalThreadsTesting {
    public static void main(String[] args) throws InterruptedException {
        SignalThreads t1 = new SignalThreads("Red");
        SignalThreads t2 = new SignalThreads("Green");
        SignalThreads t3 = new SignalThreads("Yellow");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
