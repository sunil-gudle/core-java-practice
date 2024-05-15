package src.programmingChallenges.multithreading.example2;


//Write a program that starts a thread and prints its state after each significant event (creation, starting, and termination).
// Use Thread.sleep() to simulate long-running tasks and Thread.getState() to print the thread's state.
public class ThreadStates extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run %s", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
