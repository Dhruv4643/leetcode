class Solution {
    public static boolean check(int num){
        int org=num;
        if(num<10){
                return true;
            }
        else{
            while(num!=0){
                int rem=num%10;
                if(rem==0) return false;;
                if(org%rem==0){
                   num/=10;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}