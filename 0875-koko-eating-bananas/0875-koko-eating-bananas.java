class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }

        }
        int left=1,right=max;
        
        while(left<right){
            int hours=0;
            int k=left+(right-left)/2;
            for(int p:piles){
                hours += (int) Math.ceil((double) p / k);

            }
            if(hours<=h){
                right=k;

            }
            else{
                left=k+1;
            }
        }
        return left;
        
    }
}