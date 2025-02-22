import java.util.*;
public class maxsumarraysprefix {
    public static void maxsubarraysum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];

        //calculate prefix array
       prefix[0] = numbers[0];
        for(int i=1; i<numbers.length;i++){
           prefix[i] = prefix [i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                //for(int k=start; k<=end; k++){
                  //  //print sunArray sum
                  //  currsum += numbers[k];
               // }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
               // System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum="+maxsum);
        
    }
    public static void mian(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        maxsubarraysum(numbers);
    
}
}
