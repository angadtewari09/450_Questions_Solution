
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {1, 60, -10, 70, -80, 85};
	    int min_left = 0 , min_right = 0;
	    int mint = Integer.MAX_VALUE;
	    int low = 0 , high = arr.length -1;
	    Arrays.sort( arr );
	    while ( low != high )
	    {
	        int sum = arr[low] + arr[high];
	        
	        if( Math.abs(sum) < Math.abs(mint) ){
	            mint = Math.min( sum , mint );
	            min_right = low;
	            min_left = high;
	        }
	        else if( sum < 0 )
	            low++;
	        else 
	            high--;
	    }
		System.out.println( arr[min_right] + "  and  " + arr[min_left]);
	}
}
