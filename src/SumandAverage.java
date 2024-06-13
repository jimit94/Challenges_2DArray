public class SumandAverage {
    public static void main(String[] args) {
        int[][] numArray = ArrayUtility.input2DArray();
        int sum = sum(numArray);
        float average = average(numArray);
        System.out.println("Sum of the elements in the array is : " + sum + " and average is : "
                + average);
    }

    public static int sum(int[][] numArray) {
        int sum = 0;
        int i = 0;
        while (i< numArray.length){
            int j =0;
            while (j<numArray[i].length){
                sum+=numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static float average(int[][] numArray) {
        int rows = numArray.length;
        int cols = numArray[0].length;
        return (float) (sum(numArray) / rows) / cols;
    }
}
