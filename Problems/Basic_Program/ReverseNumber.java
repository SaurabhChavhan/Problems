package Basic_Program;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        int ans = 0;
        while(num!=0){
            rem = num%10;
            ans = ans*10+rem;
            num = num/10;
        }
        System.out.println(ans);


    }
    
}
