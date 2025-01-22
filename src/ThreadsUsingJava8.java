package src;

public class ThreadsUsingJava8 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+ " Thread name");

        });
        thread.start();
    }
}
