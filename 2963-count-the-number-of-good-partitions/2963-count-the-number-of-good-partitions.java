class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            last.put(nums[i], i);
        }

        int maxLast = 0;
        int cuts = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxLast = Math.max(maxLast, last.get(nums[i]));
            if (maxLast == i) {
                cuts++;
            }
        }

        long ans = 1;
        for (int i = 0; i < cuts; i++) {
            ans =(ans * 2)%1000000007;
        }

        return (int) ans%1000000007;
    }
}