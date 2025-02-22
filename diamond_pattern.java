import java.util.*;
public class diamond_pattern {
    public static void diamond(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //  spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for( int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //next half
          
         for(int i=n; i>=1; i--){
            //  spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for( int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            diamond(7);
        }
}
