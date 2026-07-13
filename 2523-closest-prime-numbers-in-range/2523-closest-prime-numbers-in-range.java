class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] arr = new int[]{-1, -1};
        int mdiff = Integer.MAX_VALUE;
        int prev = -1;
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (prev != -1) {
                    int diff=i-prev;
                    if (diff< mdiff) {
                        mdiff = diff;
                        arr[0] = prev;
                        arr[1] = i;
                        
                    }    
                }
                prev=i;
            }
        }
        return arr;
    }

    public boolean isPrime(int n) {

        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int j = 5; j * j <= n; j += 6) {
            if (n % j == 0 || n % (j + 2) == 0)
                return false;
        }

        return true;
    }
}