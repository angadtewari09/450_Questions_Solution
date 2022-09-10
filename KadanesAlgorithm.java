//To Find the largest sum subarray
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {-5, -4 , -6, -3, -4, -1};
	    
	    int currSum = 0;
	    int maxSum = Integer.MIN_VALUE;
	    for( int i =0; i< arr.length; i++ )
	    {
	        currSum += arr[i];
	        maxSum = Math.max( currSum , maxSum);
	        if( currSum < 0 )
	            currSum = 0;
	    }
	    System.out.println(maxSum);
	}
}
