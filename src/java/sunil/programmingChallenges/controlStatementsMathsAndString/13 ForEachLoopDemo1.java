package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;


class ForEachLoopDemo1 {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram", "Shyam", "Sunil", "Anil", "Ramesh", "Suresh"
        };
        System.out.println("Result with for loop:");
        printArray(array);
        System.out.println("\n\nResult using for each loop");
        printArrayForEach(array);
    }

    // printing array data using for each loop
    public static  void printArrayForEach(String[] array){
        for(String name:array){
            System.out.print(name + " ");
        }
    }

    // printing array data using for loop
    public static void printArray(String[] array){
        for(int i =0; i< array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
