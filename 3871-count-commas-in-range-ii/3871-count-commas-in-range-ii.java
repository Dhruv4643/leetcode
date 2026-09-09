class Solution {
    public long countCommas(long n) {
        long total=0;
        long capacity=1000;
        while(capacity<=n){
            total+=(n-capacity+1);
            capacity*=1000;
        }
        return total;
    }
}