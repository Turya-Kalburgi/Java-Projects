import java.util.*;
public class invertedhalfpyramideithnum {
      
    public static void inverted_half_pyramid_with_numbers(int n){
        //outer loop for numbers of line
        for(int i=1; i<=n; i++){

            //inner loop 
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        inverted_half_pyramid_with_numbers(5);
    }
}
