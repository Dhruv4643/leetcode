class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer,Integer> res= new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < len; right++) {

            res.put(nums[right],res.getOrDefault(nums[right],0)+1);

            while (res.get(nums[right]) > k) {

                res.put(nums[left], res.get(nums[left]) - 1);
                left++;
            }


            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}