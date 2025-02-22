public class recursion_power {
    public static int optimizedpower(int a,int n){
        if( n==0 ){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
    int halfpowerSq = halfpower * halfpower;

    //n is odd
    if(n % 2 !=0){
        halfpowerSq = a * halfpowerSq;
    }
    return halfpowerSq;

}
public static void main(String args[]){
    int a =2;
    int n= 10;

System.out.println(optimizedpower(a,n));
}}