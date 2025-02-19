package src.java.sunil.programmingChallenges.encapsulationAndInheritance.example7;

public class ArrayOperations {

    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{

        double mean(){
            long sum =0;
            for (int number : numbers){
                sum +=number;
            }
            return (double) sum / numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
