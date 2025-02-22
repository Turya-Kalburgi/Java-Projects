import java.util.*;
public class set_it_bit {
    public static int setItBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(setItBit(10,2)+".");
    }
}
