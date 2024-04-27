package src.programmingChallenges.encapsulationAndInheritance.example4;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
        numberOfTyres = 2;
    }

    public void balance(){
        System.out.println("I am balancing on two tyres");
    }
}
