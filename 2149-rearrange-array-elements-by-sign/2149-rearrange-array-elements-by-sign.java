class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int p=0;
        int n=1;
        for(int x:nums){
            if(x>0){
                res[p]=x;
                p+=2;
            }
            else{
                res[n]=x;
                n+=2;
            }
        }
        return res;
    }
}