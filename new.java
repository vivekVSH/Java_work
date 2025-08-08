import java.util.Random;
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            Random rm = new Random();
            int p = rm.nextInt(nums.length);
            int q = rm.nextInt(nums.length);
            if (p > 0 && p < q && q < n - 1) {
                return true;
            } else {
                return false;
            }

        }
    }
}