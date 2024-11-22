package src.programmingChallenges.stringPrograms;

public class Str1EqualsToStr2 {
    public static void main(String[] args) {
        String str1= "HArshI";
        String str2="harsHi";

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("both strings are same");
        }
        else {
            System.out.println("both strings are not same");
        }
    }
}
