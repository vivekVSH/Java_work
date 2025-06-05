import java.util.*;

public class Array_Leetcode {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxPro){
                maxPro = price - minPrice;
            }
        }
        return maxPro;
    }

    public static boolean findDublicate(int[] array){
        Arrays.sort(array);

        for(int i=0;i<array.length-1; i++){
            if(array[i] == array[i+1]){
                return true;
            }
        }
        return false;
    }

    public static boolean checkAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean palandrom(String str){
        str = str.toLowerCase();
        String rev = "";
        for(int i=str.length() - 1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev.equals(str);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        //when buy and sell stock
        int[] price = {7,1,5,3,6,4};
        System.out.println("The max profit is : "+ maxProfit(price));

        //find the dublicate element in the array
        int[] array = {1,4,5,6,3,2,6,7};
        System.out.println(findDublicate(array));

        //check both string are same anagram
        String s = "ivvke";
        String t = "vivek";
        System.out.println(checkAnagram(s,t));

        //check string is palandrom or not
        String str = "vivek";
        System.out.println(palandrom(str));

        //print the max sum in the array
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
