class Solution {
    public void gameOfLife(int[][] img) {
        if (img == null || img.length == 0) return;

        int m = img.length;
        int n = img[0].length;
        int[][] copy = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;

                if (i - 1 >= 0 && j - 1 >= 0) sum += img[i - 1][j - 1];
                if (i - 1 >= 0) sum += img[i - 1][j];
                if (i - 1 >= 0 && j + 1 < n) sum += img[i - 1][j + 1];
                if (j - 1 >= 0) sum += img[i][j - 1];
                if (j + 1 < n) sum += img[i][j + 1];
                if (i + 1 < m && j - 1 >= 0) sum += img[i + 1][j - 1];
                if (i + 1 < m) sum += img[i + 1][j];
                if (i + 1 < m && j + 1 < n) sum += img[i + 1][j + 1];

                if (img[i][j] == 1) {
                    if (sum == 2 || sum == 3)
                        copy[i][j] = 1;
                    else
                        copy[i][j] = 0;
                } else {
                    if (sum == 3)
                        copy[i][j] = 1;
                    else
                        copy[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = copy[i][j];
            }
        }
    }
}