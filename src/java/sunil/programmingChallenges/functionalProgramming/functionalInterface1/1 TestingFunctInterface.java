package src.java.sunil.programmingChallenges.functionalProgramming.functionalInterface1;

// Create your own functional interface with a single abstract method that accepts an integer and returns a boolean.
// Implement it using a lambda that checks if the number is prime.

class TestingFunctInterface {
    public static void main(String[] args) {

        FunctionalInterfaceEx functionalInterfaceEx = num -> {

            for (int i = 2; i < num ; i++) {
                if (num%i==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(functionalInterfaceEx.isCandidate(10));
    }
}
