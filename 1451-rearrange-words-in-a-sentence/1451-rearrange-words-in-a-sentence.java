class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] s = text.split(" ");
        Arrays.sort(s, (a, b) -> a.length() - b.length());
        String res = String.join(" ", s);
        res = Character.toUpperCase(res.charAt(0)) + res.substring(1);
        return res;
    }
}