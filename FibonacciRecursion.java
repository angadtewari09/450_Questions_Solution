
//Print first n terms of Fibonacci using recursion.
//Put n = the number of terms of fibonacci to be displayed.
import java.util.*;
public class Main 
{
    public static void Fibonacci( int n ,int a , int b )
    {
        if( n == 0 )
            return ;
        n-=1;
        int c = a + b;
        System.out.print(c + " ");
        Fibonacci( n ,b , c ) ;

    }
    public static void main(String args[])
    {
        System.out.print("0 ");
        System.out.print("1 ");
        Fibonacci( 10 , 0,1);
        
    }
}
