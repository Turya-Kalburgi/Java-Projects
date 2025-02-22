import java.util.*;
public class butterfly_pattern {

    public static void butterfly(int n){
        //outer loop
        //1st first half
        for(int i=1;i<=n; i++){

            //star = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces = 2*n-1
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();

        }

        //second half
        for(int i=n; i>=1; i--){

            //star = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces = 2*n-1
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();

        }

    }
    public static void main(String args[]){
        butterfly(7);
    }
    
}
