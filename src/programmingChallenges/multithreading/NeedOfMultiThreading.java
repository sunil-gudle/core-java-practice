package src.programmingChallenges.multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        System.out.println("Welcome to multiThreading");

        long startTime = System.currentTimeMillis();

        // first Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* task is completed");

        // Second Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ task is completed");

        // Third Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# task is completed");
        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken to complete the task: "+(endTime-startTime));
    }
}
