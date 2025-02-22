import java.util.*;
public class clear_ith_bit {
    public static int clearItBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
   }

    
    public static void main(String ags[]){
        System.out.println(clearItBit(10, 1));
    }
}
