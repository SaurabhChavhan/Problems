import java.util.*;
public class Numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter Numbers: ");
        for(int i = 0; i<size; i++){
            number[i]=sc.nextInt();
        }
        System.out.print("Enter X Number: ");
        int x = sc.nextInt();
        for(int j = 0; j<size; j++ ){
            if(number[j]==x){
                System.out.println("X found at index: "+j); 
            }
        }
    }

    
}
