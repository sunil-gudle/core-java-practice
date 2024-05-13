package src.programmingChallenges.multithreading.example2;

public class ThreadStateTesting {
    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();

        System.out.printf("\nCreate the thread %s", t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s", t1.getState());
    }
}
