package src;

import java.util.List;

public class ReverserStringusingRecurssion {
    public static void main(String[] args) {

        String str = "HelloWorld";

        String output = reverse(str);
        System.out.println(output);
    }

    public static String reverse(String str){
        if(str == null || str.length()<=1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
