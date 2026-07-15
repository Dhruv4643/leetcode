class Solution {
    public int nonSpecialCount(int l, int r) {
        int maxLimit = (int) Math.sqrt(r);
        boolean[] x = new boolean[maxLimit + 1];
        Arrays.fill(x, true);
        if (maxLimit >= 0)
            x[0] = false;
        if (maxLimit >= 1)
            x[1] = false;
        for (int i = 2; i * i <= maxLimit; i++) {
            if (x[i]) {
                for (int j = i * i; j <= maxLimit; j += i) {
                    x[j] = false;
                }
            }
        }
        int start = (int) Math.ceil(Math.sqrt(l));
        int count=0;
        for (int i = start; i <= maxLimit; i++) {
            if (x[i]) {
                count++;
            }
        }
        return r - l - count + 1;
    }

}