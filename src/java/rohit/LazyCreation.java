package src.java.rohit;

public class LazyCreation {
    private static LazyCreation instance;

    private LazyCreation(){
        System.out.println("Instance Created");
    }

    public static LazyCreation getInstance(){
        if (instance == null){
            instance = new LazyCreation();
        }
        return instance;
    }
}
