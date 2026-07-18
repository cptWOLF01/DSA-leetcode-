class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use letters for ransom note
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            count[ch - 'a']--;

            if (count[ch - 'a'] < 0) {
            return false;
            }
        }

        return true;
    }
}