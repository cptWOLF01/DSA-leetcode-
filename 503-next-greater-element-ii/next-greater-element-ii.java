import java.util.*;

class Solution {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> helper = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!helper.isEmpty() && helper.peek() <= nums[index]) {
                helper.pop();
            }

            if (i < n) {
                if (helper.isEmpty()) {
                    ans[index] = -1;
                } else {
                    ans[index] = helper.peek();
                }
            }

            helper.push(nums[index]);
        }

        return ans;
    }
}