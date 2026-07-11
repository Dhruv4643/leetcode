class Solution {
    public String removeStars(String s) {
        Stack<Character> res= new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                res.pop();
            }
            else{
                res.push(ch);
            }
        }
        StringBuilder ans= new StringBuilder();
        for(char x:res){
            ans.append(x);
        }
        return ans.toString();
    }
}