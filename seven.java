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
    }
}
