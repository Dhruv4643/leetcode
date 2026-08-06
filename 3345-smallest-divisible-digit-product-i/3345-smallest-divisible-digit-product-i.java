class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            int org=i;
            int p=1;
            while(org>0){
                int rem=org%10;
                p*=rem;
                org/=10;
            }
            if(p%t==0){
                return i;
            }

        }
        return -1;
    }
}