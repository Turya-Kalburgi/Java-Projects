public class frndpair {
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
       /*  //choice
        //single
        int fnm1 = friendspairing(n-1);

        //pair
        int fnm2 = friendspairing(n-2);
        int pairway = (n-1)*fnm2;

        //totways
        int totway = fnm1 + pairway;
       return totway;
        */

        return  friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(4));
    }
}
