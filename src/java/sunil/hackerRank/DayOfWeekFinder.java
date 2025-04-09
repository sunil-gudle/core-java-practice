package src.java.sunil.hackerRank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (dd-MM-yyyy): ");
        String input = scanner.nextLine();

        // Define the expected format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Parse the input string into a LocalDate
            LocalDate date = LocalDate.parse(input, formatter);

            // Get the day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Format it nicely (e.g., Wednesday instead of WEDNESDAY)
            String formattedDay = dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();

            System.out.println("Day of the week: " + formattedDay);
        }catch (Exception e){
            System.out.println("Invalid date format. Please dd-MM-yyyy.");
        }
        scanner.close();
    }
}
