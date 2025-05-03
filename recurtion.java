public class recurtion {

    //this function for print reverse number
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    //this function for the calculate factorial
    public static int calFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
 
        int factorial = n * calFactorial(n-1);
        return factorial;
    }

    //this fucnction for the calculate fibonnach series
    public static void calcuFabbo(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c  = a + b;
        System.out.println(c);
        calcuFabbo(b, c, n-1);
    }

    public static void main(String args[]){
        int n = 7;
        printNum(n);

        int ans = calFactorial(n);
        System.out.println(ans);

        int a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);
        calcuFabbo(a,b,n-2);
    }
}
