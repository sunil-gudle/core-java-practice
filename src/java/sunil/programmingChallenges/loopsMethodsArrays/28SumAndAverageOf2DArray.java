package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Create a program to do sum and average of all elements in a 2-D array.

class SumAndAverageOf2DArray {
    public static void main(String[] args) {

        System.out.println("Welcome to sum and average of 2D array\n");
        int[][] numArray = ArrayInputUtility.input2DArray();

        long sum = sumOf2D(numArray);
        System.out.println("Sum of the 2D Array: "+ sum);
        double avg = average(numArray);
        System.out.println("Average to 2D Array "+ avg);

    }
    public static long sumOf2D(int[][] numArray){

        long sum = 0;
        int i = 0;
        while (i< numArray.length){
            int j = 0;
            while (j< numArray[i].length){
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average(int[][] numArray){

        if(numArray.length==0){
            return 0;
        }
        int rows = numArray.length;
        int columns = numArray[0].length;
        long sum = sumOf2D(numArray);
        double size = rows * columns;

        return sum/size;
    }
}
