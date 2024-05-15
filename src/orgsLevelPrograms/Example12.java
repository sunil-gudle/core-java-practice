package src.orgsLevelPrograms;

import java.util.*;

// inputlist = {4,3,6,5,3,4,2,1,6,7,9,0,0,1}
//requiredoutput = {4,3,6,0,1}
public class Example12 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(4, 3, 6, 5, 3, 4, 2, 1, 6, 7, 9, 0, 0, 1);
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : inputList) {
            if (!uniqueElements.add(num)) { // If the number is already in the set
                resultSet.add(num);
            }
        }
        List<Integer> requiredOutput = new ArrayList<>(resultSet);
        System.out.println("Required Output: " + requiredOutput);

    }
}
