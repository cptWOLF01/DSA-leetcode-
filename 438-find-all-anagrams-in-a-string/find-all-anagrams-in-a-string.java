class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters of p and first window of s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pCount, sCount))
            ans.add(0);

        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {

            // Remove left character
            sCount[s.charAt(i - p.length()) - 'a']--;

            // Add new right character
            sCount[s.charAt(i) - 'a']++;

            if (Arrays.equals(pCount, sCount)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}