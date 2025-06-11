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

    public static void main(String[] args) {
        int n = 5;
        int bad = 4;

        Binary_Search_Leetcode solution = new Binary_Search_Leetcode(bad);
        int firstBad = solution.firstBadVersion(n);

        System.out.println("First bad version is: " + firstBad);
    }
}
