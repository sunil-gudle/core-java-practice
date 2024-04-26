package src.programmingChallenges.controlStatementsMathsAndString;

// Simulate a dice roll using Math.random() and display the outcome (1 to 6).

class Dice {
    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);

    }

    public static void main(String[] args) {

        Dice dice = new Dice();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
