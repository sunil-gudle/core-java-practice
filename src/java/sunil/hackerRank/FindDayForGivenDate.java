package src.java.sunil.hackerRank;

// find the day for the given date

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDayForGivenDate {

    public static String findDay(int month, int day, int year){
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the date in MM dd yyyy format: ");
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String result = findDay(month, day, year);
        System.out.println(result);
        bufferedReader.close();
    }

}
