class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> used = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Pattern character already has a word
            if (map.containsKey(ch)) {

                if (!map.get(ch).equals(word)) {
                    return false;
                }

            } else {

                // Word is already mapped to another character
                if (used.containsKey(word)) {
                    return false;
                }

                map.put(ch, word);
                used.put(word, ch);
            }
        }

        return true;
    }
}