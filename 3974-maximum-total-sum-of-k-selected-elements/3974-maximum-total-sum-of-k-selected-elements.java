class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums){
            pq.offer(x);
        }
        long sum=0;
        while(k>0 && !pq.isEmpty()){
            int max=pq.poll();
            if(mul>0){
                sum+=(long)mul*max;
            }
            else{
                sum+=max;
            }
            mul--;
            
            k--;
        }
        return sum;
    }
}