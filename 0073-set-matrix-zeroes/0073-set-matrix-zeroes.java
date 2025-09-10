class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int coloumn = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i=0;i<row;i++){
            for(int j =0;j<coloumn;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    col.add(j);
                }
            }
        }
         for(int i=0;i<row;i++){
            for(int j =0;j<coloumn;j++){
                if(rows.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
         }
    }
}