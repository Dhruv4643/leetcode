class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder res = new StringBuilder();
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(res.length() > 0){
                    res.deleteCharAt(res.length() - 1);
                }
            }
            else{
                res.append(s.charAt(i));
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(ret.length() > 0){
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
            else{
                ret.append(t.charAt(i));
            }
        }

        return res.toString().equals(ret.toString());
    }
}