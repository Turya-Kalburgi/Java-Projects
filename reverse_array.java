import java.util.*;
public class reverse_array {
    public static void reverse(int numbers[]){
        int first=0, last=numbers.length-1;

        while(first < last){
             //swap
             int temp = numbers[last];
             numbers[last] = numbers[first];
        }
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
    }
}
