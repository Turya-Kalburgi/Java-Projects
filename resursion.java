public class resursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
        public static void printInc(int n){
            if (n==1){
                System.out.print(n);
                return;
            }
            printInc(n-1);
            System.out.print(n+" ");
        }

        public static int fact(int n){
            if (n == 0){
                return 1;
            }
            int fnm1 = fact(n-1);
            int fn = n * fact(n-1);
            return fn;
        }

        public static int calsum(int n){
               if ( n== 1){
                return 1;
               }
               int snm1 = calsum(n-1);
               int sn = n + snm1;
               return sn;
        }

        public static int fib(int n){
            if ( n==0 || n==1){
                return n;
            }
            int fnm1 = fib(n-1);
            int fnm2 = fib(n-2);
            int fn = fnm1 + fnm2;
            return fn;
        }

        public static boolean isSorted(int arr[],int i){
            if(i== arr.length-1){
                return true;
            }
            if (arr[i]>arr[i+1]){
                return false;
            }
            return isSorted(arr,i+1);
        }

        public static int firstoccurence(int arr[],int key,int i){
             if(i==arr.length){
                return -1;
             }
             if(arr[i] == key){
                return i;
             }
             return firstoccurence(arr,key,i+1);
        }

        public static int lastocc(int arr[],int key,int i){
            if(i== arr.length){
                return -1;
            }
            int isfound = lastocc(arr,key,i+1);
            if(isfound == -1 && arr[i] == key){
                return i;
            }
            return isfound;
        }

        public static int power(int x,int n){
            if( n==0){
                return 1;
            }
            return x * power(x,n-1);
        }
    
    public static void main(String args[]){
        //int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(power(2,10));
    }

}