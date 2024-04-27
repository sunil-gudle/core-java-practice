package src.programmingChallenges.encapsulationAndInheritance.example4;

public class Vehicle {
    protected int numberOfTyres;

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tyres\n", numberOfTyres);
    }
}
