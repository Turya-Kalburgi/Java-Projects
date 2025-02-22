/* import java.util.*;
public class arraysCC {
    
    public static void main(String args[]){

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

       // System.out.println("length of array ="+ marks.length);

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//maths

        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("maths :"+marks[2]);

        marks[2] = marks[2]+1;
        System.out.println("maths :"+marks[2]);

        int percentage =( marks[0] + marks[1]+ marks[2]) / 3;
        System.out.println("percentahe :"+percentage+"%");

    }
}*/
import java.util.*;
public class arraysCC {
    public static void main(String args[]){

        double marks[] = new double [100];
        Scanner sc= new Scanner(System.in);

        marks[0] = sc.nextDouble(); //physics 
        marks[1] = sc.nextDouble();  //chemistry
        marks[2] = sc.nextDouble();  //maths

        System.out.println("physics="+marks[0]);
        System.out.println("chemistry="+marks[1]);
        System.out.println("mathematics="+marks[2]);

        double percentage=(marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("percentage are="+percentage+"%");

    }
}
