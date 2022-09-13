//Time: O(N*d) 
//Space: O(1)

import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 3;
        d = d%arr.length;
        
        for( int i =1;i<=d; i++ )
        {
            for( int j =0; j< arr.length-1; j++ )
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        for( int j =0; j< arr.length; j++ )
            System.out.print(arr[j] + " ");
    }
}
