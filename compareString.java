import java.util.*;
public class compareString {
    

    public static void main(String args[]){
    
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1 ==s2){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");

        }
    }
    
}
