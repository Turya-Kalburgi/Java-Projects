import java.util.*;
public class positive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0){
            System.out.println("+ve number");

        }
        else if(num<0){
            System.out.println("-ve number");
        }
        else{
            System.out.println("enter valid number");
        }
    }
    
}
