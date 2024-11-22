package src.programmingChallenges.stringPrograms;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String str="harshi is a good girl";
        String[] words= str.split(" ");

        System.out.println("length of words in a String: " +words.length);

        for (String word:words){
            System.out.println(word);
        }
    }
}
