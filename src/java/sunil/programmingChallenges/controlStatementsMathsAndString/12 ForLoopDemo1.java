package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

class ForLoopDemo1 {
    public static void main(String[] args) {
        System.out.println("Returning the numbers from 1 to 100");
        // using while loop
        int i = 0;
        while (i<100){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        //using for loop
        for (int j=0;j<100;j++){
            System.out.print(j + " ");
        }
    }
}
