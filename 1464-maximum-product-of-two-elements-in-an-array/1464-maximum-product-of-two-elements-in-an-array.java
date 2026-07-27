class Solution {
    public int maxProduct(int[] nums) {
        int second=Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE;
        for(int n:nums){
            if(n-1>first){
                second=first;
                first=n-1;
            }
            else if(n-1>second){
                second=n-1;
            }

        }
        return first*second;
    }
}