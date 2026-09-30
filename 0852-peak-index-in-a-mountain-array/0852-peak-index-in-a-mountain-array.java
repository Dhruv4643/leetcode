class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binary(arr, 1, arr.length - 2);
    }

    private static int binary(int[] arr, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (arr[mid] < arr[mid + 1]) {
            return binary(arr, left + 1, right);
        } else {
            return binary(arr, left, right - 1);
        }
    }
}