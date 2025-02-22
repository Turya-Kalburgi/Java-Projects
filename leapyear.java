import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int leapyear = sc.nextInt();

        boolean x = (leapyear % 4 == 0);
        boolean y = (leapyear % 100 !=0);
        boolean z = ((leapyear % 100 ==0) && (leapyear % 400 ==0) );

        if(x && (y || z)){
            System.out.println(leapyear+"is a leap yaer");
        }
        else{
            System.out.println(leapyear+"is not a laep yaer");
        }
    }
    
}
