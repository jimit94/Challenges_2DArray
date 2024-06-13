public class DiagonalSum {
    public static void main(String[] args) {
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sum(numArray);
        System.out.println("Sum of the diagonal elements is : " + sum);

    }

    public static long sum(int[][] numArray) {
        long leftSum = leftDiagonal(numArray);
        long rightSum = rightDiagonal(numArray);
        long total = leftSum + rightSum;
        if(numArray.length % 2 !=0){
           int index = numArray.length / 2;
           total-=numArray[index][index];
        }
        return total;
    }

    public static long leftDiagonal(int[][] numArray) {
        long sum = 0;
        int i =0;
        while (i<numArray.length){
            sum+=numArray[i][i];
            i++;
        }
        return sum;
    }
    public static long rightDiagonal(int[][] numArray) {
        long sum = 0;
        int i = 0;
        int j =numArray.length - 1;
        while (i<numArray.length){
            sum+=numArray[i][j];
            j--;
            i++;
        }
        return sum;
    }
}
