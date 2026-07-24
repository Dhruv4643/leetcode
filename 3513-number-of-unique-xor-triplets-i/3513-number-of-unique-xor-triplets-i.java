class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int k = 1;
        while (k <= n) {
            k <<= 1;
        }
        
        return k;
    }
}