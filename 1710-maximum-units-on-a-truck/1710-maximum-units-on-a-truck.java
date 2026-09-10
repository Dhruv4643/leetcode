class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int count = box[0];
            int units = box[1];

            if (truckSize >= count) {
                totalUnits += count * units;
                truckSize -= count;
            } else {
                totalUnits += truckSize * units;
                break;
            }
        }

        return totalUnits;
    }
}