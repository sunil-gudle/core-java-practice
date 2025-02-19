package src.java.sunil.programmingChallenges.encapsulationAndInheritance.example7;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
