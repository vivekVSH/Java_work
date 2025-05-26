import java.util.*;

public class six {

    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return (n * factorial(n -1));
    }
    public static void main(String[] args) {

        //sort array using userdefine method
        int[] array = {2,4,5,3,24,2,3,5,5,8,96,5,4};
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        System.out.println();

        //factorial using recursion
        int n = 10;
        System.out.println(factorial(n));

        //
    }
}
