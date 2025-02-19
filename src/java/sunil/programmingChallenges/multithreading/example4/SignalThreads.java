package src.java.sunil.programmingChallenges.multithreading.example4;


// Simulate a traffic signal using threads. Create three threads representing three signals: RED, YELLOW, and GREEN.
// Each signal should be on for a certain time, then switch to the next signal in order.
// Use sleep for timing and synchronize to make sure only one signal is active at a time.
public class SignalThreads extends Thread{

    private final String color;

    public SignalThreads(String color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread started %s\n", Thread.currentThread().getName(), color);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread ended %s\n", Thread.currentThread().getName(), color);
    }
}
