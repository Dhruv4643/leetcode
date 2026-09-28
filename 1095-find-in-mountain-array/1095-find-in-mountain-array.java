/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int peekidx(MountainArray mountainArr,int left,int right){
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }
        return left;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int idx=peekidx(mountainArr,0,n-1);
        int left=0;
        int right=idx;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=mountainArr.get(mid);
            if(val == target){
                return mid;
            }
            else if(val<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=idx;
        right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=mountainArr.get(mid);
            if(val== target){
                return mid;
            }
            else if(val<target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;

    }
}