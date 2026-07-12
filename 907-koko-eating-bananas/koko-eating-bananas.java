class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;

        // Find the largest pile
        int right = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        while (left < right) {

            int mid = (left + right) / 2;

            int hours = 0;

            // Calculate total hours needed
            for (int i = 0; i < piles.length; i++) {

                // Ceiling of piles[i] / mid
                if (piles[i] % mid == 0) {
                    hours = hours + (piles[i] / mid);
                } else {
                    hours = hours + (piles[i] / mid) + 1;
                }
            }

            if (hours <= h) {
                right = mid;      // Try a smaller speed
            } else {
                left = mid + 1;   // Increase the speed
            }
        }

        return left;
    }
}