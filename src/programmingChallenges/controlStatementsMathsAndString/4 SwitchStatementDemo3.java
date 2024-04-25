package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

class SwitchStatementDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to old switch statement and new statement\n");
        System.out.print("Please enter the day: ");
        int day = scanner.nextInt();
        newSwitch(day);
        oldSwitch(day);
    }

    // this change has come after java 14 upgrade
    public static void newSwitch(int day) {
        String output = switch (day) {
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
    public static void oldSwitch(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
