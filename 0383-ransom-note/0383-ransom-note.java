class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r[]=new int[26];
        int m[]=new int[26];
        for(char ch:ransomNote.toCharArray()){
            r[ch-'a']++;
        }
        for(char ch:magazine.toCharArray()){
            m[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(r[i]>m[i]){
                return false;
            }
        }

        return true;
    }
}