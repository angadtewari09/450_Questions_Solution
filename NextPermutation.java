//Find the NEXT PERMUTATION
/* Steps involved: 
    1. Tranversing from the back, find index1 such that arr[i] < arr[i+1].
    2. Tranversing from the back, find index ' i ' such that arr[index1] < arr[i].
    3. Swap the values of arr[index1] and arr[i]
    4. Then reverse the array from index+1 to end.
    5. If no such index1 is found then simplye reverse the array from 0 till the end.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {5,4,3,2,1};
	    int flag = 0;
	    int index1 = -1;
	    
	    for( int i = arr.length-2; i>=0; i-- )
	    {
	        if( arr[i] < arr[i+1] ) {
	            index1 = i;
	            flag =1;
	            break;
	        }
	    }
	    //System.out.println( arr[index1] );
	    if( flag == 1 )
	    {
            for( int i = arr.length-2; i>=0; i-- )
            {
                if( arr[index1] < arr[i] )
                {
                    int temp = arr[index1];
                    arr[index1] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
	    }
	    int low = index1 + 1;
	    int high = arr.length-1;
	    while( high != low )
	    {
	        int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
	    }
	
	for( int i = 0; i< arr.length; i++ )
	    System.out.print(arr[i] +" ");
	}
}
