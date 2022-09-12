//Program to find the longest prefix in the given String array.
import java.util.*;
public class Main
{
  public static String getPrefix( String arr[] )
  {
    Arrays.sort( arr );
    int end = Math.min( arr[0].length() , arr[ arr.length-1 ].length() ) - 1;
    int start = 0;
    
    while( start <=end ) {
        if( arr[0].charAt(start) != arr[ arr.length-1 ].charAt(start) ) 
          break;
        start++;
    }
    return arr[0].substring(0 , start);
  }
	public static void main(String[] args) {
	    String arr[] = {"apple" , "app" , "bananat", "appetite" , "apparant", "bangalore"};
      System.out.println( getPrefix(arr) );
	}
}
	    
