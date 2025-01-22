package src.programmingChallenges.stringPrograms;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String str1= "hello";
        String str2= "harshi";
        String temp="";

        System.out.println("string before swapping:   " +str1 +" "+str2);
//        temp=str1;
//        str1=str2;
//        str2=temp;

        str1=str1+ str2;
        str2= str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("string after swapping:    " +str1 +" "+str2);
    }
}
