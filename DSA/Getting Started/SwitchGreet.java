import java.util.*;
public class SwitchGreet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namstey");
                break;
            case 3:
                System.out.println("Ram Ram");
                break;
            default:
                System.out.println("Enter from 1,2,3 Only...");
        }

    }

    
}
