//Using O(n) Space
class Solution {
    public int maxProfit(int[] arr) 
    {
       int max = Integer.MIN_VALUE;
	    
	    Stack<Integer> stack = new Stack<>();
	    stack.push( arr[ arr.length -1]);
	    int newarr[] = new int[arr.length];
	    newarr[ arr.length -1 ]  = arr[arr.length -1];
	    
	    for( int i = arr.length-2; i>=0; i-- ) 
	    {
	        if( stack.peek() < arr[i] )
	        {
	            stack.pop();
	            stack.push( arr[i] );
	            newarr[ i ]  = arr[i];
	        }
	        else
	            newarr[i] = stack.peek();
	    }
        for( int i =0; i< arr.length; i ++ )
	        max = Math.max( max , newarr[i] - arr[i]);
	    return max;
        
    }
}
