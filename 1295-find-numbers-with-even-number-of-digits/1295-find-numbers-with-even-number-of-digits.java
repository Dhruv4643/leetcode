class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int len=check(num);
            if(len%2==0){
                count++;
            }
        }
        return count;
        
    }
    static int check(int n){
        if(n<0){
            n=n*-1;
        }
        return (int)Math.log10(n)+1;
        
    }
}