import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row x Column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int [row][col];
        System.out.println("Enter Row Number & Column Number: ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
