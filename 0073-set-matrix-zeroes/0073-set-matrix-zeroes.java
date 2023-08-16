class Solution {
    static int min=-8;
    public static void markZeroRows(int arr[][], int rows, int col)
    {
        int i;
        for(i=0; i<col; i++)
        {
            if(arr[rows][i]!=0)
            {
                arr[rows][i]=min;
            }
        }
    }
    public static void markZeroColumns(int arr[][], int col, int rows)
    {
        int i;
        for(i=0; i<rows; i++)
        {
            if(arr[i][col]!=0)
            {
                arr[i][col]=min;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length, col=matrix[0].length;
        int i,j;
        for(i=0; i<rows; i++)
        {
            for(j=0; j<col; j++)
            {
                if(matrix[i][j]==0)
                {
                    markZeroRows(matrix, i, col);
                    markZeroColumns(matrix, j, rows);
                }
            }
        }
        for(i=0; i<rows; i++)
        {
            for(j=0; j<col; j++)
            {
                if(matrix[i][j]==min)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}