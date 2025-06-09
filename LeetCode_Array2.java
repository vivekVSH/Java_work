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
    public static void main(String[] args){

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagram(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
