class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Store all numbers in the HashMap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        // Check numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}