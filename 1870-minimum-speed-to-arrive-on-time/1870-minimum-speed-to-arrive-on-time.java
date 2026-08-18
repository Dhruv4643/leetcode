class Solution {
    public double time(int[]arr,int k){
        double hrs=0;
        for(int i=0;i<arr.length-1;i++){
            hrs+=(arr[i]+k-1)/k;
        }
        hrs+=(double)arr[arr.length-1]/k;
        return hrs;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10000000;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (time(dist, mid) <= hour) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}