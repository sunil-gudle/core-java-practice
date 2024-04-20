package src.programmingChallenges.loopsMethodsArrays;

class ParametersDemo1 {
    public static void main(String[] args) {
        int num = sumOfTwoNumbers(4, 7);
        System.out.println(num);
    }
    public static int sumOfTwoNumbers(int first, int second){
        System.out.println("First number is: "+ first);
        System.out.println("Second number is: "+second);
        return (first + second);
    }
}
