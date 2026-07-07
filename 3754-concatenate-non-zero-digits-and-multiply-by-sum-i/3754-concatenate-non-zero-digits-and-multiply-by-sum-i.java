class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        String nonzero=s.replace("0","");
        if(nonzero=="") return 0;
        long num=Long.valueOf(nonzero);
        long sum=0;
        long temp=num;
        while(temp!=0){
            int rem=(int)temp%10;
            sum+=rem;
            temp/=10;

        }
        return (long)(num*sum);
    }
}