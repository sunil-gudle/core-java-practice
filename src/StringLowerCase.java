/*In java Given a string of lowercase characters from 'a' - 'z'. We need to write a program to print the characters of this string in sorted order.
Examples:
Input: bbccdefbbaa
Output: aabbbbccdef*/

package src;

public class StringLowerCase {
    public static void main(String[] args) {
        String input = "bbccdefbbaa";
        String sortedString = sortString(input);
        System.out.println("Output: " + sortedString);
    }

    private static String sortString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Use Arrays.sort to sort the character array
        java.util.Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);
    }
}
