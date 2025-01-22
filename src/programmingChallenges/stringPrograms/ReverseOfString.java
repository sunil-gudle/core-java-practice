package src.programmingChallenges.stringPrograms;

public class ReverseOfString {
    public static void main(String[] args) {
        String str="harshi";
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);
        }

        System.out.println("given string: " +str);
        System.out.println("reversed string: " +rev);
    }
}
