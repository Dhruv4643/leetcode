class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=0;
            while(i<chars.length && ch==chars[i]){
                count++;
                i++;
            }
            chars[idx++]=ch;
            if(count>1){
                String s= Integer.toString(count);
                for(char x:s.toCharArray()){
                    chars[idx++]=x;
                }
            }
        }
        return idx;
    }
}