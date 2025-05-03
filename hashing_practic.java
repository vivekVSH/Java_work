import java.util.HashMap;
import java.util.HashSet;

public class hashing_practic {

    public static void majorityElement(int nums[]){

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            if(map.containsKey(nums[i])){

                map.put(nums[i], map.get(nums[i]) +1);

            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){

            if(map.get(key) > n/3){

                System.out.println(key);
            }
        }
    }
    
    public static int union(int arr1[], int arr2[]){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }

        return set.size();
    }

    public static int intersection(int arr1[], int arr2[]){

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;
    }

    public static int factorial(int n){
           
        if( n == 1){
            return 1;
        }

        int fac1 = factorial(n-1);
        int fac2 = n * fac1;

        return fac2;
    }

    public static void main(String args[]){
        int nums[] = {1,3,5,4,4,4,1,1,1,4,5,4,4,4,1,1,1,3};
        majorityElement(nums);

        int arr1[] = {2,4,6,4,6,8,9};
        int arr2[] = {4,6,2,6,7,9,5,4,3,3,7,8,1};

       int ans = union(arr1, arr2);
       System.out.println(ans);

       int ans2 = intersection(arr1, arr2);
       System.out.println(ans2);

       int n = 5;
       int ans3 = factorial(n);
       System.out.println(ans3);
    }
}
