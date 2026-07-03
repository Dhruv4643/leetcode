class Solution {
    public boolean halvesAreAlike(String s) {
        int b = s.length()/ 2;
        int a = b - 1;
        int count=0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (int i=0;i<=a;i++){
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        for (int i=b;i<s.length();i++){
            if (vowels.contains(s.charAt(i))) {
                count--;
            }
        }
        return count==0;

    }
}