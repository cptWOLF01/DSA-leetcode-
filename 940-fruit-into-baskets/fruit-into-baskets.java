class Solution {

    public int totalFruit(int[] fruits) {

        // HashMap stores:
        // Key   -> Fruit type
        // Value -> Number of times that fruit appears in the current window
        HashMap<Integer, Integer> map = new HashMap<>();

        // Left pointer of the sliding window
        int left = 0;

        // Stores the maximum number of fruits collected
        int max = 0;

        // Move the right pointer from left to right
        for (int right = 0; right < fruits.length; right++) {

            // Current fruit at the right pointer
            int fruit = fruits[right];

            // If the fruit already exists in the map,
            // increase its count by 1
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            }
            // Otherwise, add the fruit with count = 1
            else {
                map.put(fruit, 1);
            }

            // If there are more than 2 different fruit types,
            // keep shrinking the window from the left
            while (map.size() > 2) {

                // Fruit at the left pointer
                int leftFruit = fruits[left];

                // Reduce its count because it is leaving the window
                map.put(leftFruit, map.get(leftFruit) - 1);

                // If its count becomes 0,
                // remove it completely from the map
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                // Move the left pointer to the right
                left++;
            }

            // Calculate the current valid window size
            int windowSize = right - left + 1;

            // Update the maximum answer if needed
            if (windowSize > max) {
                max = windowSize;
            }
        }

        // Return the maximum number of fruits collected
        return max;
    }
}