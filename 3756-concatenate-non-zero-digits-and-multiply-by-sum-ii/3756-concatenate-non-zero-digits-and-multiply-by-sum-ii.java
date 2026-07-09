class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();
        long mod = 1000000007;

        int[] res = new int[queries.length];
        long[] prefix = new long[n];
        long[] prestr = new long[n];
        int[] len = new int[n];
        long[] power = new long[n+1];

        power[0] = 1;
        for(int i=1;i<=n;i++){
            power[i] = (power[i-1]*10)%mod;
        }


        prefix[0] = s.charAt(0)-'0';

        if(s.charAt(0)=='0'){
            prestr[0]=0;
            len[0]=0;
        }
        else{
            prestr[0]=s.charAt(0)-'0';
            len[0]=1;
        }


        for(int i=1;i<n;i++){

            prefix[i]=(prefix[i-1]+(s.charAt(i)-'0'))%mod;

            if(s.charAt(i)=='0'){
                prestr[i]=prestr[i-1];
                len[i]=len[i-1];
            }
            else{
                prestr[i]=(prestr[i-1]*10+(s.charAt(i)-'0'))%mod;
                len[i]=len[i-1]+1;
            }
        }


        for(int i=0;i<queries.length;i++){

            int st=queries[i][0];
            int ed=queries[i][1];

            long val;
            long sum;

            if(st==0){
                val=prestr[ed];
                sum=prefix[ed];
            }
            else{

                int remove=len[st-1];

                val=(prestr[ed]-
                    (prestr[st-1]*power[len[ed]-remove])%mod
                    +mod)%mod;

                sum=(prefix[ed]-prefix[st-1]+mod)%mod;
            }


            if(val==0){
                res[i]=0;
            }
            else{
                res[i]=(int)((val*sum)%mod);
            }
        }

        return res;
    }
}