class Solution {
    public String longestPalindrome(String s) {
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String odd=s.substring(left+1,right);
            if(odd.length()> x.length()){
                x=odd;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String even=s.substring(left+1,right);
            if(even.length()> x.length()){
                x=even;
            }
        }
        return x;
    }
}