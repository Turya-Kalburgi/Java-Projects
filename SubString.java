import java.util.*;
public class SubString {
    public static String subsreing(String str , int si , int ei){
       String substr ="";
       for(int i=si; i<ei; i++){
          substr += str.charAt(i);
       }
       return substr;
    }
    public static void main(String args[]){
        //substring
      String str = "Hello Wolrd";
      System.out.println(str.substring(3,5));
     // System.out.println(subsreing(str,3,5));
    }
    
}
