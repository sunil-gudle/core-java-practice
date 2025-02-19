package src.java.sunil.programmingChallenges.stringPrograms;

import java.util.function.BiPredicate;

public class StringLengh {
    public static void main(String[] args) {
        String str = "sun";
        int num = 3;

        BiPredicate<String, Integer> isLengthGreaterThan = (str1, n) -> str.length() == num;

        // Test cases
        System.out.println(isLengthGreaterThan.test("Sun", 3));

    }
}
