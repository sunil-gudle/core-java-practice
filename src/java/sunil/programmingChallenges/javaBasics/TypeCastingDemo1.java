package src.java.sunil.programmingChallenges.javaBasics;

public class TypeCastingDemo1 {
    public static void main(String[] args) {
        int i = 10;

        //Widening type casting from int to long
        long l = i;
        //Widening type casting from int to double
        double d = i;
        System.out.println("Integer: "+ i);
        System.out.println("Long: "+ l);
        System.out.println("Double: "+ d);

    }
}
