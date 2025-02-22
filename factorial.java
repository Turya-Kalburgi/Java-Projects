import java.util.*;
public class factorial {
    public static int facto(int n) {
    int f = 1;

    for(int i=1; i<=n; i++){
        f= f*i;    
    }
    return f;
    }

    public static int bincoeff(int n,int r){
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr= facto(n-r);

        int bitcoeff= fact_n / (fact_r * fact_nmr);
       return bincoeff;
    }
        
   // public static void mian(String args[]){
      //  System.out.println(factorial(2)); 
       public static void main(String args[]){
         System.out.println(bincoeff(3,5));
       }
}      
    
 
//code is not running