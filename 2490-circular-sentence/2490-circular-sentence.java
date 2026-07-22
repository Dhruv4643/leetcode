class Solution {
    public boolean isCircularSentence(String sentence) {
        char [] ch = sentence.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' ') if(ch[i-1]!=ch[i+1]) return false;
        }
        return ch[0]==ch[ch.length-1];
    }
}