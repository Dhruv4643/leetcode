import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for (int num : nums) {

            int digitSum = 0;
            int x = num;

            while (x > 0) {
                digitSum += x % 10;
                x /= 10;
            }

            if (map.containsKey(digitSum)) {
                ans = Math.max(ans, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }

        return ans;
    }
}