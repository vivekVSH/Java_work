import java.util.*;

public class seven {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for merged array in nums1

        // While there are elements to compare in both arrays
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void printPyramid(int row) {
        char ch = 'A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }

    public static boolean elementCheck(int[] array1, int[] array2){
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();

        for(int num : array1){
            set1.add(num);
        }

        for(int num : array2){
            set2.add(num);
        }

        return set1.equals(set2);
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // Create sets for nums1 and nums2 to store unique elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Populate sets
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        
        // Count indices where nums1[i] exists in nums2
        int answer1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) answer1++;
        }
        
        // Count indices where nums2[i] exists in nums1
        int answer2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) answer2++;
        }
        
        // Return the result as an array
        return new int[] {answer1, answer2};
    }

    public static void main(String[] args) {
        //merge two array and sort them in assending order
        int[] nums1 = {2, 3, 5, 0, 0, 0, 0}; // Sorted array with m=3 valid elements
        int m = 3;
        int[] nums2 = {1, 4, 6, 7}; // Sorted array
        int n = 4;

        // Call merge method
        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged array in ascending order:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        //print pyramid of charecter
        int row = 5;
        printPyramid(row);
        System.out.println();

        //remove dublicate element in arrays and check both array are same or not
        int[] a1 = {1, 2, 3, 2, 1};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3, 4};

        System.out.println(elementCheck(a1 ,a2));
        System.out.println(elementCheck(a1 ,a3));
        System.out.println();

        //Find Common Elements Between Two Arrays and their counts
        int[] numsd = {2, 3, 2};
        int[] numss = {1, 2};
        int[] result1 = findIntersectionValues(numsd, numss);
        System.out.println("Test : " + Arrays.toString(result1));
    }
}
