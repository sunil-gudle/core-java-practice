package src.java.sunil.programmingChallenges.stringPrograms;





public class Palindrome {
    public static void main(String[] args) {
        String str="naman";
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println("strings are palindrome");
        }else {
            System.out.println("strings are not palindrome");
        }
    }
}
