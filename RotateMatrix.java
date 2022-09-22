//Rotate an N*M matrix by 90 deg
class Solution {
    public void rotate(int[][] matrix) 
    {
        int row = matrix.length;
        int col = matrix[0].length;
        Queue<Integer> q = new LinkedList<>();
         for( int i=0; i< col; i++ )
	    {
	        for( int j=col-1; j>=0; j-- )
	            q.add( matrix[j][i] );
	    }
        for( int i=0; i< row; i++ )
	    {
	        for( int j= 0; j< col; j++ )
	            matrix[i][j] = q.remove();
	    }
    }
}
//TIME: O(n*m)  SPACE: O(n*m)
