/*import java.util.*;
public class passing_arrays {
    public static void update(int marks[]){
       //int nonchangable = 10;
       for(int i=0; i<marks.length ; i++){
         marks[i] = marks[i]+1;

       }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        //int nonchangable = 5;
        update(marks);
        //System.out.println(nonchangable);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
            System.out.println();
        }
    }
}
*/

import java.util.*;
public class passing_arrays{
    public static void update( int marks[]){
       // uncangable = 10;
        for(int i=0; i < marks.length; i++){      
            marks[i]=marks[i]+1;
        }
    }
        public static void main(String args[]){
         //unchangable
            int marks[] = {97,98,99};
         update(marks);

         //print our maks + 1

         for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
         }
         System.out.println();
            

        }
    }

