import java.util.*;
public class ifelse {
    public static void main(String args[]){
        int age = 13;
        if (age>=18){
            System.out.println("adult : drive ,vote");
        }
        if(age>13 && age<18){
            System.out.println("teenage");
        }
        else{
            System.out.println("not adult");
        }
    }
    
}
