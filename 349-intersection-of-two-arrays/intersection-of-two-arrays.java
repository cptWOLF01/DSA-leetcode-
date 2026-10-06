class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {

            boolean alreadyAdded = false;

            // Check if this element is already in result
            for (int k = 0; k < index; k++) {
                if (result[k] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) {
                continue;
            }

            // Check if nums1[i] exists in nums2
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    result[index] = nums1[i];
                    index++;

                    break;
                }
            }
        }

        // Create array of exact size
        int[] answer = new int[index];

        for (int i = 0; i < index; i++) {
            answer[i] = result[i];
        }

        return answer;
    }
}