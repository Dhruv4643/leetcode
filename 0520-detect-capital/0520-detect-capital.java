class Solution {
    public boolean detectCapitalUse(String word) {
        int u=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                u++;
            }
        }
        if(u==0 || u==word.length()){
            return true;
        }
        else if(u==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}