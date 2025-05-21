package src.java.sunil.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create Locales
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN"); // Custom Locale for India
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Create Currency Formatters
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(franceLocale);

        // Format payment
        String us = usFormatter.format(payment);
        String india = indiaFormatter.format(payment);
        String china = chinaFormatter.format(payment);
        String france = franceFormatter.format(payment);

        // Output
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
