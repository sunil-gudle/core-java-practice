package src.java.sunil.programmingChallenges.abstractionAndPolymorphism;

class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10.11, 10.11));
        System.out.println(calc.add(11.11, 12.12, 13.13));
    }
}
