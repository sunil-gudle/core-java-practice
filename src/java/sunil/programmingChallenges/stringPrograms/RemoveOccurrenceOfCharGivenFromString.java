package src.java.sunil.programmingChallenges.stringPrograms;

public class RemoveOccurrenceOfCharGivenFromString {
    public static void main(String[] args) {
        String str="harshi";
        char c='h';

        String newStr=str.replace(String.valueOf(c),"");

        System.out.println("given string: " +str);
        System.out.println("string after removal of char : " +newStr);
    }
}
