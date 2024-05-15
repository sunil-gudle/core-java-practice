package src.programmingChallenges.encapsulationAndInheritance.example4;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.commute();
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();
    }

}
