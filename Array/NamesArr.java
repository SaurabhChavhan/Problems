import java.util.*;
public class NamesArr {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
        
        for(int i = 0; i<size; i++){
            name[i] = sc.next();
        }
        for(int j = 0; j<size; j++){
            System.out.println("Name " + (j+1) +" is : " + name[j]);
        }
        
    }
    
}
