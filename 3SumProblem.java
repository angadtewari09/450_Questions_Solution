import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
    	    int  nums[] = {-1,0,1,2,-1,-4};
    	    Arrays.sort(nums);
    	    ArrayList< ArrayList<Integer> > list = new ArrayList<>();
    	    for( int i =0; i<nums.length-2; i++ )
    	    {
    	        if( i==0 || (i > 0 && nums[i] != nums[i - 1]) )
    	        {
    	            int low=i+1 , high = nums.length-1, sum = 0-nums[i];
    	            
    	            while( low<high ) 
    	            {
    	                ArrayList<Integer> temp = new ArrayList<>();
    	               if( nums[low] + nums[high] == sum ){
    	                   
    	                   temp.add( nums[i] );
    	                   temp.add( nums[low] );
    	                   temp.add( nums[high] );
    	                   list.add( temp );
    	                   
    	                   while( low< high && nums[low] == nums[low+1] )
    	                        low++;
    	                   while( low< high && nums[high] == nums[high-1] )
                                high--;
                        low++;
                        high--;
    	               }
    	               else if( nums[low] + nums[high] > sum  )
    	                    high--;
    	               else
    	                    low++;
    	                
    	            }
    	        }
    	    }
    	    System.out.println( list);
    	}
}
