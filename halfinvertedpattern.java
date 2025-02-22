import java.util.*;
public class halfinvertedpattern {
   
    public static void inverterd_rotated_half_pyramid(int n){
        //outer loop
       for(int i=1; i<=n; i++){
          //spaces
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }

          //stars
          for(int j=1; j<=i; j++){
             System.out.print("*");
          }
             System.out.println();
            
          }

       } 
       public static void main(String argd[]){
        inverterd_rotated_half_pyramid(4);
       }
        }
    

