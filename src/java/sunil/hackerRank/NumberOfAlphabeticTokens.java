package src.java.sunil.hackerRank;

public class NumberOfAlphabeticTokens {
    public static void main(String[] args) {
        String str = "Sunil gudle from maharashtra 413541, currently living in Blr";

        String[] tokens = str.split("[^A-Za-z]+");

        int count = 0;
        for (String token : tokens){
            if (!token.isEmpty()){
                count++;
            }
        }
        System.out.println("Total number of alphabetic tokens: "+ count);
    }
}
