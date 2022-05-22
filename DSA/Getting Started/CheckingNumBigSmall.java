import java.util.*;
public class CheckingNumBigSmall {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Equal");
        }
        else{
            if(num1>num2){
                System.out.println("First Number is BIG" );
            }
            else{
                System.out.println("Second Number is BIG");
            }
        }
    }
    
}
