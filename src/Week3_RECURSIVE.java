public class Week3_RECURSIVE {
    public static void main(String args[]) {
        fibonacci_values(20);
    }

    public static int summethod(int n) {
        if (n == 0) {
            return 0;
        }
        return n + summethod(n-1);
    }
    public static int print(int n){
        System.out.println(n + " ");
        if(n==1) {
            return n;
        }
        return print(n-1);
    }
    public static void printto_n(int n){
        System.out.print(n + " " );
        if(n==1){
            return;
        }
        printto_n(n-1);
    }
    public static int powerof(int x,int y){
        if(y==0){
            return 1;
        }
        return x*powerof(x,y-1);
    }
    public static int summethodeven(int n) {
        if (n == 0) {
            return 0;
        }
        if(n%2==0){
            return n + summethodeven(n-1);
        }
        else{
            return summethodeven(n-1);
        }
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fibonacci_values(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int findsmallest(int[] array,int index){
        if (index==array.length-1){
            return array[index];
        }
        int smallest = findsmallest(array,index+1);

        if(array[index]<smallest){
            return array[index];
        }
        else{
            return smallest;
        }



    }
}