class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int row = 0;
        int col = 0;
        int[][] res = new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                res[row][col] = mat[i][j];
                col++;
                if(col == c){
                col = 0;
                row++;
            }
        }
          
        }
        return res;
        
    }
}
