class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int sum = 0;
        int mul = (n / 8);
        int rem= n%8;
            sum += rem *(mul+1);
            while (mul > 0) {
                sum += 8 * mul;
                mul--;
            }

        
        return sum;
    }
}