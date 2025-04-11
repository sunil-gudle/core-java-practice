package src.java.sunil.hackerRank;

import java.util.Scanner;

public class AppendStringProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the given string: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str1.length() + str2.length());

        System.out.println(str1.compareTo(str2) > 0 ? "Yes": "No");

        str1 = str1.substring(0,1).toUpperCase() + str1.substring(1);
        str2 = str2.substring(0,1).toUpperCase()+ str2.substring(1);

        System.out.println(str1 + " "+ str2);
    }
}
