class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int n=0;
        StringBuilder res= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='-'){
                continue;
            }
            if(n==k && !res.isEmpty()){
                res.append('-');
                n=0;
                
            }
            res.append(Character.toUpperCase(ch));
            n++;
            

        }
        return res.reverse().toString();
    }
}