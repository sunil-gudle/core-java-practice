package src.java.sunil.programmingChallenges.abstractionAndPolymorphism.example2;

public class Eagle extends Bird{


    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is a bird");
    }
}
