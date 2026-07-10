class Solution {
    public String convert(String s, int n) {
        if(n==1 || n>=s.length()){
            return s;
        }
        StringBuilder[] res= new StringBuilder[n];
        for(int i=0;i<n;i++){
            res[i]=new StringBuilder();
        }
        int row=0;
        boolean down=true;
        for(char ch:s.toCharArray()){
            res[row].append(ch);
            if(row==0){
                down=true;
            }
            else if(row==n-1){
                down=false;
            }
            row+=down?1:-1;
            


        }
        StringBuilder ans= new StringBuilder();
        for(StringBuilder x:res){
            ans.append(x);
        }
        return ans.toString();
    }
}
    
