// Time Complexity: Linear traversal twice O(m*n)
// Space: O(1);

class Solution {
    public void setZeroes(int[][] matrix) {
        int colvar = 1;
        int column = matrix[0].length;
        int row = matrix.length;
        for(int i=0; i< row;i++){
            if(matrix[i][0] == 0)
                colvar=0;
            for(int j=1; j<column ;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
//                     marking the left most and the top most element zero;
                }
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (colvar == 0) matrix[i][0] = 0;
        }
    }
}