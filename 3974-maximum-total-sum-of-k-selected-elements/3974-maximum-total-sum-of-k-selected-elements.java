class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        long sum = 0;
        for (int i = n; i >= 0; i--) {
            if (mul > 0) {
                sum += (long) mul * nums[i];
            } else {
                sum += nums[i];
            }
            mul--;

            k--;
            if (k == 0)
                break;
        }
        return sum;
    }
}