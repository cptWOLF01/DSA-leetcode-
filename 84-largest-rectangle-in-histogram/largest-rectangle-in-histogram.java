import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        Stack<Integer> helper = new Stack<>();

        // Previous Smaller
        for (int i = 0; i < n; i++) {

            while (!helper.isEmpty()
                    && heights[helper.peek()] >= heights[i]) {

                helper.pop();
            }

            if (helper.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = helper.peek();
            }

            helper.push(i);
        }

        helper.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!helper.isEmpty()
                    && heights[helper.peek()] >= heights[i]) {

                helper.pop();
            }

            if (helper.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = helper.peek();
            }

            helper.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = next[i] - prev[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}