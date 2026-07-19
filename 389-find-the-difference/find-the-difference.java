class Solution {
    public char findTheDifference(String s, String t) {

        int[] count = new int[26];

        if( s.length() < t.length()){

        // Count letters in t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']++;
        }

        // Remove letters of s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;
        }

        // Find the remaining letter
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return (char)(i + 'a');
            }
        }

        }

        else{
             for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Remove letters of s
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // Find the remaining letter
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return (char)(i + 'a');
            }
        }

        }
        return ' ';
    }
}