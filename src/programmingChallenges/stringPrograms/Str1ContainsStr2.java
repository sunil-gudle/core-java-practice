package src.programmingChallenges.stringPrograms;

import java.util.Scanner;

public class Str1ContainsStr2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1= scanner.next();
        System.out.println("Enter 2nd string: ");
        String str2=scanner.next();

        if (str1.contains(str2)){
            System.out.println("1st string contains 2nd string");
        }
        else {
            System.out.println("1st string does not contain 2nd string");
        }
    }
}
