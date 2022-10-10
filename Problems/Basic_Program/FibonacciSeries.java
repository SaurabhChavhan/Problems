package Basic_Program;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.print(num1+" ");
            sum = num1+num2;
            num1 = num2;
            num2 = sum;           
        }

    }
    
}
