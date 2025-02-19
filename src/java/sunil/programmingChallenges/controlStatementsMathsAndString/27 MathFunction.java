package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

class MathFunction {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));
        System.out.println(Math.ceil(99.04));
        System.out.println(Math.floor(99.04));
        System.out.println(Math.round(5.57));
        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random()*100);
            System.out.println(random);
        }
    }
}
