package src.java.sunil.programmingChallenges.loopsMethodsArrays;

class MethodsDemo1 {
    public static void main(String[] args) {
        System.out.println("In main method");
        greeting();
        System.out.println("Method calling completed");
        System.out.println();
        printPattern();
    }

    public static void greeting() {
        System.out.println("Good Morning from Sunil G.");
    }

    public static void printPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
