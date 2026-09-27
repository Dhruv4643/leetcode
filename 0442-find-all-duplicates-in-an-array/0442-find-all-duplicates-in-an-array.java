class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                ans.add(n);
            }
            set.add(n);
        }
        return ans;
    }
    
}