package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

class SwitchStatementDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to new switch statement\n");
        System.out.print("Please enter the day in number: ");
        int day = scanner.nextInt();

        String output = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(output);
    }
}
