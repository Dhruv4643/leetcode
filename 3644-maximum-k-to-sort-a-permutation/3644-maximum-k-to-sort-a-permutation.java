class Solution {
    public int sortPermutation(int[] nums) {
        int k=-1;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                flag=false;
                k&=nums[i];
            }
        }
        if(flag){
            return 0;
        }
        return k;
    }
}