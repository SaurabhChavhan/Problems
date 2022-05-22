import java.util.*;
public class SwitchCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator[+ - * / %]:");
        char oprt = sc.next().charAt(0); 
        System.out.println("Answer:");

        
        switch(oprt){
            case '+': System.out.println(num1+num2);
            break;
            case '-': System.out.println(num1-num2);
            break;
            case '*': System.out.println(num1*num2);
            break;
            case '/': System.out.println(num1/num2);
            break;
            case '%': System.out.println(num1%num2);
            break;
            default: System.out.println("Use Only [+ - * / %]");
        }
    }
    
}
