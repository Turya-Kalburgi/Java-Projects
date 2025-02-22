import java.util.*;
public class product {
    public static int product(int a,int b){
        int product= a * b;
        return product;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int prod = product(a,b);
        System.out.println("the product is :"+prod);
    }
}
