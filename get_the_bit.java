import java.util.*;
public class get_the_bit {
    public static int getItBit(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
        public static void main(String args[]){
            System.out.println(getItBit (10000,2));
        
        
    }
}
