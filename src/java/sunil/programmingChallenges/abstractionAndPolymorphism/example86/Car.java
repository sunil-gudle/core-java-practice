package src.java.sunil.programmingChallenges.abstractionAndPolymorphism.example86;

public class Car extends Vehicle {

    @Override
    public void service(){
        super.service();
        System.out.println("Car is starting...");
    }
}
