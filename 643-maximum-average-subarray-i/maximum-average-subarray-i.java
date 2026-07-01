class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum - nums[i - k];

            windowSum = windowSum + nums[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return (double) maxSum / k;
    }
}