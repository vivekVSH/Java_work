//leetcode problem no 278
class VersionControl {
    private int firstBad;

    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    // API method to check if a version is bad
    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

public class Binary_Search_Leetcode extends VersionControl {

    public Binary_Search_Leetcode(int firstBad) {
        super(firstBad);
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid; // Look on the left side
            } else {
                left = mid + 1; // Look on the right side
            }
        }

        return left;

    }

    //leetcode problem no 35
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        // If not found, left is the insertion position
        return left;
    }

    //leetcode problem no 162
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is on the left side (including mid)
                right = mid;
            } else {
                // Peak is on the right side
                left = mid + 1;
            }
        }

        // left == right is the peak index
        return left;
    }

    public static void main(String[] args) {
        int n = 5;
        int bad = 4;

        Binary_Search_Leetcode solution = new Binary_Search_Leetcode(bad);
        int firstBad = solution.firstBadVersion(n);

        System.out.println("First bad version is: " + firstBad);

        
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums2, 2));
    }
}
