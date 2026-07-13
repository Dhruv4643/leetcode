class Solution {
    public int countPrimes(int n) {
        boolean[] x= new boolean[n];
        for(int i=2;i<n;i++){
            x[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(x[i]){
                for(int j=i*i;j<n;j+=i){
                    x[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<x.length;i++){
            if(x[i]){
                count++;
            }
        }
        return count;
    }
}