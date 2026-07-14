class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (compare(words[i], pattern)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public boolean compare(String s, String t) {

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';

            if (map1[a] == -1 && map2[b] == -1) {
                map1[a] = b;
                map2[b] = a;
            } else if (map1[a] != b || map2[b] != a) {
                return false;
            }
        }

        return true;
    }
}