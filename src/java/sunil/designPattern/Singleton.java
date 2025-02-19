package src.java.sunil.designPattern;

public class Singleton {
    private static Singleton instance;

    // Private constructor to restrict instantiation
    private Singleton() {}

    // Public method to provide a single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

