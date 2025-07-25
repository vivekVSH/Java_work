import java.util.*;
import java.io.*;
import java.math.*;

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

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Calculate prefix products (left side)
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix products (right side) and multiply with prefix
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }

    public static int[] dailyTemperature(int[] temperatures){
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

    public static int calculator(String s){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }
            else if(c == '+'){
                result = result + sign * number;
                number = 0;
                sign = 1;
            }
            else if(c == '-'){
                result = result + sign * number;
                number = 0;
                sign = -1;
            }
            else if(c == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if(c == ')'){
                result = result + sign * number;
                number = 0;
                result = result * stack.pop();
                result = result + stack.pop();
            }

        }
        result = result + sign * number;
        return result;
    }

    public static int maxDifference(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        ArrayList<Integer> oddFreq = new ArrayList<>();
        ArrayList<Integer> evenFreq = new ArrayList<>();

        for(int f : freq){
            if(f > 0){
                if(f % 2 == 1){
                    oddFreq.add(f);
                }else{
                    evenFreq.add(f);
                }
            }
        }
        
        int maxDiff = Integer.MIN_VALUE;
        for(int odd : oddFreq){
            for(int even : evenFreq){
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }
        return maxDiff;
    }

    public static void main(String[] args){

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagram(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }

        //find minimum number in array
        int nums[] = {3,6,7,2,5,8,9};
        System.out.println(findMin(nums));

        //find product all in element in array except i
        LeetCode_Array2 sol = new LeetCode_Array2();
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = sol.productExceptSelf(nums1);

        for (int val : result1) {
            System.out.print(val + " ");
        }
        System.out.println();

        //calculate the temprature increase by day
        int[] temperature = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperature(temperature);
        System.out.print("Result : " + Arrays.toString(res));
        System.out.println();

        //basic calculator
        String s = " 2-1 + 2 ";
        System.out.println("Output: " + calculator(s));

        //count max freq of string 
        String str5 = "aaaaabb";
        System.out.println(maxDifference(str5));

    }
}
