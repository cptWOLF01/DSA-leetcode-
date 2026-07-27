class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> helper = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!helper.isEmpty()
                    && temperatures[helper.peek()] <= temperatures[i]) {

                helper.pop();
            }

            if (helper.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = helper.peek() - i;
            }

            helper.push(i);
        }

        return ans;
    }
}