import java.util.*;
public class one_zeropattern {
    
    public static void one_zero_trangle(int n){
        // inner loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2==0){
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }  
    public static void main(String args[]){
        one_zero_trangle(4);
    }

}
