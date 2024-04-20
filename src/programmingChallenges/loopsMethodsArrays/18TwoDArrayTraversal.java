package src.programmingChallenges.loopsMethodsArrays;

class TwoDArrayTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 1}, {4, 5, 6,1}, {7, 8, 9,1}, {10, 11, 12,1}};

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
