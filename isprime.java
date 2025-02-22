import java.util.*;
public class isprime {
    public static boolean isprime(int n){

        if (n==2){
            return true;
        }

        boolean isprime = true;
        for(int i= 2; i<=n-1;i++){
            if(n%2==0){
                isprime=false;
                //return false  "or condition"
            }
        }
        return isprime;
        //return true  "or condition"
    }
    public static void main(String args[]){
      System.out.println(isprime(2));
    }
}
