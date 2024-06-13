import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array search");
       int[][] numArray = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(numArray,num);
        if(isFound){
            System.out.println("Your number is found");
        }else {
            System.out.println("Your number is not found");
        }
    }

    public static boolean isFound(int[][] numArray,int num) {
        int i = 0;
        while (i<numArray.length){
            int j =0;
            while (j<numArray[i].length){
                if(numArray[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}