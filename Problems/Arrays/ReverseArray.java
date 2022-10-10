package Arrays;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        

        for(int  i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j = arr.length-1;
        int temp = 0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
