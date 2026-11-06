class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1=(ax2-ax1)*(ay2-ay1);
        int y1=(bx2-bx1)*(by2-by1);
        int ow=Math.max(0,Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int ol=Math.max(0,Math.min(ay2,by2)-Math.max(ay1,by1));
        int oa=ow*ol;
        return x1+y1-oa;
        
    }
}