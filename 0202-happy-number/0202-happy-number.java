class Solution {
    public boolean isHappy(int n) {
        if(n==2) return false;
        Set<Integer> seen = Set.of(4, 16, 37, 58, 89, 145, 42, 20);
       
        while(n!=1){
            if(seen.contains(n)) return false;
            int x=0;
            while(n>0){
                int rem=n%10;
                x+=rem*rem;
                n/=10;            
            }
            n=x;
        }
        return true;

}}