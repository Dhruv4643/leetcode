class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            last.put(nums[i], i);
        }

        long c=1;
        int i=0,j=0;
        while(i<nums.length){
            if(i>j){
                c=(c*2)%1000000007;
            }
            j=Math.max(j,last.get(nums[i]));
            i++;
        }

        return (int)c;
    }
}