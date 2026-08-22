class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int pro=1;
        while(org>0){
            int rem=org%10;
            sum+=rem;
            pro*=rem;
            org/=10;
        }
        int res=sum+pro;
        return n%res==0;
    }
}