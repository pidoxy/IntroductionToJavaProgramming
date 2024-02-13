import java.util.Scanner;
import java.util.Arrays;

public class Matrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int matrix1[][] = new int[3][2];

        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                matrix1[row][col] = input.nextInt();
            }   
        }

        System.out.print("the matrix is" + Arrays.deepToString(matrix1));
    }
}