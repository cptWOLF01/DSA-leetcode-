class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<String, List<Integer>> map = new HashMap<>();

        // Sort p
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String key = new String(pArr);

        map.put(key, new ArrayList<>());

        // Sliding window
        for (int i = 0; i <= s.length() - p.length(); i++) {

            String window = s.substring(i, i + p.length());

            char[] arr = window.toCharArray();
            Arrays.sort(arr);

            String sortedWindow = new String(arr);

            if (sortedWindow.equals(key)) {
                map.get(key).add(i);
            }
        }

        return map.get(key);
    }
}