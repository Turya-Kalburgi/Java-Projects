import java.util.*;
public class sunArrays {
    public static void sub_arrays(int numbers[]){
        int ts=0;
        
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
                for(int k=start; k<=end;k++){//print
                    System.out.print(numbers[k]+" ");//subarray 
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sunarryas =  "+ts);

    }
    public static void mian(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        sub_arrays(numbers);
    }
}
