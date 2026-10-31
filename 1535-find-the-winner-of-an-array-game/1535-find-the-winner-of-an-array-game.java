class Solution {
    public int getWinner(int[] arr, int k) {
        int start = arr[0];
        int c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (start > arr[i]) {
                c++;
            } else {
                start = arr[i];
                c = 1;
            }
            if (c == k) return start;
        }
        return start;
    }
}
