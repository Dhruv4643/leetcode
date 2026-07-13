class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = 0;
            for(int j=i;j<=9;j++){
                num = num * 10 + j;
                if(num>=low && num<=high)res.add(num);
                else if(num>high) break;
            }
        }
        Collections.sort(res);
        return res;

    }
}