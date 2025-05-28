import java.util.*;

public class eight {
    public static void main(String[] args){
        //return the sum of element in the array and print new array
        int[] array = {2,5,4,7,8,9,10};
        int[] newArray = new int[array.length];
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
            newArray[i] = sum;
        }
        System.out.print(Arrays.toString(newArray));
        System.out.println();

        //shuffle array in random indexs
        int[] array1 = {2,5,4,7,8,9,10};
        Random rand = new Random();
        for(int i=0; i<array1.length; i++){
            int randomIndexToSwap = rand.nextInt(array1.length);
            int temp = array1[randomIndexToSwap];
            array1[randomIndexToSwap] = array1[i];
            array1[i] = temp;
        }
        System.out.print(Arrays.toString(array1));
        System.out.println();
    }
}
