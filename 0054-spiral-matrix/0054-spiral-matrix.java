class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0,er=m-1,sc=0,ec=n-1;
        List<Integer> ans= new ArrayList<>();
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }sr++;
            for(int i=sr;i<=er;i++){
                ans.add(matrix[i][ec]);
            }ec--;
            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    ans.add(matrix[er][i]);
                }
                er--;
            }if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }

        }
        return ans;
    }
}