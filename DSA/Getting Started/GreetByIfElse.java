import java.util.*;
public class GreetByIfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if(num==1){
            System.out.println("Hello");
        }
        else if(num==2){
            System.out.println("Namstey");
        }
        else if(num==3){
            System.out.println("Ram Ram");
        }
        else{
            System.out.println("Use only 1,2,3 Numbers");
        }
    }
}