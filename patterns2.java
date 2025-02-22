import java.util.*;
public class patterns2 {
    public static void hollow_rectangle(int totrows, int totcols){
        //outer line
        for(int i=1; i<=totrows; i++){
            //inner line
            for( int j=1; j<=totcols; j++){
            //cell(i,j)
            if(i== 1 || i== totrows || j== 1 || j== totcols){
                //boundary cells
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }
    
    
}
public static void main(String args[]){
    
    hollow_rectangle(4, 5);
}
}

