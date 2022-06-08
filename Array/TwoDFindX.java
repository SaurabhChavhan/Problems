import java.util.*;
public class TwoDFindX {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row X Column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter Matrix Number: ");

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter X Number: ");
        int x = sc.nextInt();
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){

                if(matrix[i][j]==x){
                    System.out.println("X Found at ( Row: "+i+"  Col: "+ j+ " )");
                }
            }
        }
    }
}
