package src.java.sunil.programmingChallenges.collections;

import java.util.ArrayList;
import java.util.List;

class ListTesting {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Sunil");
        strList.add("Ramesh");
        strList.add("Suresh");
        strList.add(1, "Kamlesh");

        System.out.println("List results using normal for loop");
        // list iteration
        for(int i =0; i< strList.size(); i++){
            System.out.print(strList.get(i)+ " ");
        }

        System.out.println("\nList results using for each loop");
        // for each loop
        for (String str : strList){
            System.out.print(str+ " ");
        }

        System.out.println("\nArray results using normal for loop");
        // String array iteration
        String [] arr ={"Sunil", "Ramesh", "Suresh", "Kamlesh"};
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nArray results using for each loop");
        for (String str1 : arr){
            System.out.print(str1 + " ");
        }

    }
}
