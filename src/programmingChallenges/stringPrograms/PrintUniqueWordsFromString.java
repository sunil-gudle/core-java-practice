package src.programmingChallenges.stringPrograms;

public class PrintUniqueWordsFromString {
    public static void main(String[] args) {
        String str="harshi is good but Sunil is not";
        int count;
//        HashSet set=new HashSet<>();
        String[] words= str.split(" ");
//
//        for (String word:words){
//            set.add(word);
//        }
//        System.out.println("length of words in a String: " +words.length);
//
//        for (Object s:set){
//            System.out.println(s);
//        }

        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "";
                }
            }
            if (count == 1 && words[i] != "") {

                System.out.println((words[i]));
            }

        }

    }
}
