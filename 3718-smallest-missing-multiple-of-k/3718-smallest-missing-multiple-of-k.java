class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        int x=0;
        int y;
        while(true){
            x+=k;
            if(!res.contains(x)){
                y=x;
                break;
            }
        }
        return y;

    }
}