class Solution {
    public int mySqrt(int x) {

        // Special case
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            // Find middle
            int mid = left + (right - left) / 2;

            // Use long to avoid overflow
            long square = (long) mid * mid;

            // Perfect square
            if (square == x) {
                return mid;
            }

            // mid is a possible answer
            if (square < x) {
                ans = mid;
                left = mid + 1;
            }

            // Square is greater than x
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}