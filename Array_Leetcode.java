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
        
    }
}
