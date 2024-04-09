/*In java Given two arrays a[]and[]of size n and m respectively.
 The task is to find union between these two arrays.Union of the two arrays can be defined as the set containing distinct elements from both the arrays.If there are repetitions,then only one occurrence of element should be printed in the union.
  Note:Elements are not necessarily distinct.
        Example 1:
        Input:5 3
        12345
        123
        Output:5
        Explanation:1,2,3,4and 5are the elements which comes in the union set of both arrays.So count is 5.*/


        package src.orgsLevel;

import java.util.HashSet;

public class UnionBtnTwoArrays {
    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        int result = findUnion(a,b);
        System.out.println(result);
    }

    private static int findUnion(int[] a, int[] b){

        HashSet<Integer> unionSet = new HashSet<>();

        // adding elements from array 'a' to the unionSet
        for(int value : a){
            unionSet.add(value);
        }

        // adding elements from array 'b' to the unionSet
        for(int value : b){
            unionSet.add(value);
        }

        // returning the count of elements in the union set
        return unionSet.size();
    }
}
