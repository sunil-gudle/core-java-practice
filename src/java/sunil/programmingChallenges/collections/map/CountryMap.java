package src.java.sunil.programmingChallenges.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Create a Map where the keys are country names (as String) and the values are their capitals (also String).
// Populate the map with at least five countries and their capitals.
// Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map.
public class CountryMap {

    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijin");
        countryMap.put("Pak", "Islampur");
        countryMap.put("Srilanka", "Colombo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the country name: ");
        String country = scanner.next();

        if (countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        }else
            System.out.println("Sorry, we couldn't find the capital name");
    }
}
