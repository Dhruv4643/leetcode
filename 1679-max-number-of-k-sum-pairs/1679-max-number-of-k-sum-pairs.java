class Solution {
    public int maxOperations(int[] nums, int k) {
        // Arrays.sort(nums);

        // int left = 0;
        // int right = nums.length - 1;
        // int count = 0;

        // while (left < right) {
        //     int sum = nums[left] + nums[right];

        //     if (sum == k) {
        //         count++;
        //         left++;
        //         right--;
        //     } 
        //     else if (sum < k) {
        //         left++;
        //     } 
        //     else {
        //         right--;
        //     }
        // }

        // return count;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;


    }
}