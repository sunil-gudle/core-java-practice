package src.java.rohit;

public class EagerCraetion {
    private static final EagerCraetion instance = new EagerCraetion();

    private EagerCraetion(){
        System.out.println("Instance created");
    }

    public static EagerCraetion getInstance(){
        return instance;
    }
}
