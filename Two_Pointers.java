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

    //check the string is anagram
    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return array1.equals(array2);
    }

    //sort colour in assending order
    public static void sortColour(int[] nums){
        int count0 = 0; int  count1 = 0; int  count2 = 0;
        for(int num : nums){
            if(num == 0){
                count0++;
            }else if(num == 1){
                count1++;
            }else{
                count2++;
            }
        }

        int index = 0;
        while (count0-- > 0) nums[index++] = 0;
        while (count1-- > 0) nums[index++] = 1;
        while (count2-- > 0) nums[index++] = 2;
    }

    //sliding window problem
    //two pointer old code 
    public static boolean twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    //Logest repeting charecter replacement 
    public static int charecterReplacement(String s , int k){
        int[] freq = new int[26];
        int maxFreq = 0;
        int left = 0;
        int result = 0;

        for(int rigth = 0; rigth < s.length(); rigth++){
            char c = s.charAt(rigth);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            int windowSize = rigth - left + 1;
            if(windowSize - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            result  = Math.max(result , rigth - left + 1);
        }
        return result;
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
        System.out.println(); 

        //anagram problem
        String s1 = "listen";
        String s2 = "silent";

        if (checkAnagram(s1, s2)) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }

        int[] nums1 = {2,0,2,1,1,0};
        sortColour(nums1);
        System.out.print(Arrays.toString(nums1));
        System.out.println(); 

        //sum of two element 
        int[] st = {1,4,6,7,8,9};
        System.out.println(twoSum(st, 13));
        
        //max frequency of charecter in window in the repating charecter
        System.out.println(charecterReplacement("ABAB", 2)); 
    }
}
