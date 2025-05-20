import java.util.*;

public class third {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static boolean checkOddNum(List<Integer> ls){
        for(int i : ls){
            if(i % 2 == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){

        //fibonacci using recursion
        int number = 10;
        System.out.println("Here is count of number"+number);

        for(int i=0; i<number; i++){
            System.out.print(fibonacci(i)+ " ");
        }
        System.out.println();
        //check odd number in list using for each loop
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("List 1: " + list1 + " -> All odd? " + checkOddNum(list1));
       
    }
}
