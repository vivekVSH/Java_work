import java.util.HashSet;
import java.util.Arrays;

public class Two_Pointers {
    public static int removeDublicate(int[] array){
        int n = array.length;
        int idx = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
                array[idx++] = array[i];
            }
        }
        return idx;
    }

    //leetcode problem no 2294
    public static int prationArray(int[] arr, int k){
        Arrays.sort(arr);

        int count = 1;
        int start = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - start > k){
                count++;
                arr[i] = start;
            }
        }
        return count;
    }

    //leetcode problem no 283
    public static void moveZero(int[] arr){
        int insertPos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[insertPos];
                arr[insertPos] = temp;

                insertPos++;
            }
        }
    }

    //leetcode problem no 977
    public static int[] squareNum(int[] arass){
        int n = arass.length;
        for(int i=0; i<n; i++){
            arass[i] = arass[i] * arass[i];
        }

        Arrays.sort(arass);

        return arass;
    }
    public static void main(String[] args){
        //remove dublicate element from sorted array
        int[] arr = {1,1,4,4,5,6,7,7,8,9,9};
        int newSize = removeDublicate(arr);
        for(int i=0; i<newSize; i++){
            System.out.print(arr[i] + " ");
        }

        //Partition Array Such That Maximum Difference Is K
        int[] arr1 = {3, 6, 1, 2, 5};
        int k = 2;
        System.out.println(prationArray(arr1,k));

        //add all in array to end of array 
        int[] arr3 = {0,3,4,0,4,0,6,7};
        moveZero(arr3);
        System.out.println(Arrays.toString(arr3)); 

        //sort the square of every element in the array
        int[] nums = {-4,-1,0,3,10};
        System.out.print(Arrays.toString(squareNum(nums)));
    }
}
