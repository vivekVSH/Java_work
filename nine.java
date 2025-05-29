import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class nine {
    public static void main(String[] args) {
        // print date in specific formate
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date); // 06-23-2020

        //how to merge two arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        ArrayList<Integer> mergeList = new ArrayList<>(list1);
        mergeList.addAll(list2);

        System.out.print(mergeList);
        System.out.println();

        //print two hashmap data
        HashMap<Integer , String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(4,"four");
        map2.put(5,"five");
        map2.put(6,"six");

        HashMap<Integer,String> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        //remove add occurese charecter from string
        String str = "asdgdsdfafaaaasdff";
        str = str.replace("a","");
        System.out.println(str);

        //count every charcter in string
        String str1 = "sddddfdsdadgawwergeghwsedgxmiuyulklkrrytgh";

        char[] chars = str1.toCharArray();
        HashMap<Character , Integer> maps = new HashMap<>();

        for(char c : chars){
            if(maps.containsKey(c)){
                maps.put(c, maps.get(c) + 1);
            }else{
                maps.put(c , 1);
            }
        }
        System.out.println(maps);

    }
}
