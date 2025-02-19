package src.java.sunil.programmingChallenges.javaBasics;

public class TypeCastingDemo2 {
    public static void main(String[] args) {
        double d = 3932.344;

        //explicit type casting
        short s = (short) d;
        int i = (int) d;
        long l = (long) d;

        System.out.println("Double: "+d);
        System.out.println("Short: "+ s);
        System.out.println("Integer: "+i);
        System.out.println("Long: "+ l);
    }
}
