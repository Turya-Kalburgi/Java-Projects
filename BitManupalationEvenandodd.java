import java.util.*;
public class BitManupalationEvenandodd {
    public static void evenorodd(int n){
        int bitmast = 1;
        if((n & bitmast) == 0){
        //even number
        System.out.println("number is even");
    }else {
        System.out.println("number is odd");
    }
}
    public static void main(String agrs[]){
        evenorodd(3);
        evenorodd(11);
        evenorodd(14);
    }
}

