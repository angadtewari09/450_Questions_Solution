import java.util.*;
public class Main 
{
    public static int gcd( int a , int b )
    {
        if( b == 0 )
            return a;
        return gcd( a, a%b );
    }
    public static int lcm( int a , int b )
    {
        return ( (a*b)/gcd(a,b) );
    }
}
