class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str= sentence.split("\\s+");
        int n= str.length;
        for(int i=0;i<str.length-1;i++){
            String s= str[i];
            String x=str[i+1];
            if(s.charAt(s.length()-1)!=x.charAt(0)){
                return false;
            }
        }
        String first=str[0];
        String last=str[n-1];
        return last.charAt(last.length()-1)==first.charAt(0);
    }
}