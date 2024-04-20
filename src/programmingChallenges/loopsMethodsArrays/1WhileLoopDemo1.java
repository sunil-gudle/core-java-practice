package src.programmingChallenges.loopsMethodsArrays;


import java.util.Scanner;

class WhileLoopDemo1 {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // Actual work
            num = num + 1; // updating the condition
        }
        System.out.println("\nReverse counting: ");
        int count = 500;
        while (count >=200){
            System.out.println(count);
            count = count-1;
        }

        System.out.println("\ntaking input from user: ");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<5){
            int input = scanner.nextInt();
            System.out.println("Number is: "+ input);
            i++;

        }
    }
}
