class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(String s:words){
            boolean v=true;
            for(char x:s.toCharArray()){
                if(allowed.indexOf(x)==-1){
                    v=false;
                    break;
                }
            }
            if(v) ans++;
        }
        return ans;
    }
}