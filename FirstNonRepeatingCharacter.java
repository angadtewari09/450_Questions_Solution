//First non-repeating Character in String.
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        String str = "UniqueNumbers";
        str = str.toLowerCase();
        
        int arr[] = new int[256];

        for(int i = 0 ; i<str.length(); i++)
        {
            arr[(int)str.charAt(i)]++;
        }
        for( int i=0; i<str.length(); i++ ) {
            if( arr[(int)str.charAt(i)] == 1 )
                {
                    System.out.print( str.charAt(i));
                    break;
                }
        }
    }
}
