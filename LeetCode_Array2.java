import java.util.*;
import java.io.*;

public class LeetCode_Array2 {

    public static List<List<String>> groupAnagram(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String words : strs){
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);
        }
        return new ArrayList<>(map.values());
    }

    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[left] < nums[right]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return nums[left];
    }
    public static void main(String[] args){

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagram(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }

        int nums[] = {3,6,7,2,5,8,9};
        System.out.println(findMin(nums));
    }
}
