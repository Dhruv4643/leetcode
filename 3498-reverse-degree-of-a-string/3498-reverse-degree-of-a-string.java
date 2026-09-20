class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=1;i<s.length()+1;i++){
            char ch=s.charAt(i-1);
            int value='z'-ch+1;
            res+=(value*i);
        }
        return res;
    }
}