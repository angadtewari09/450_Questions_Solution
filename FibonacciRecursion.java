
//Print first n terms of Fibonacci using recursion.
//Put n = the number of terms of fibonacci to be displayed.
import java.util.*;
public class Main 
{
    public static void Fibonacci( int n ,int a , int b )
    {
        if( n == 0 )
            return ;
        System.out.print( ( a+b ) + " ");
        Fibonacci( n-1 ,b , ( a+b ) ) ;

    }
    public static void main(String args[])
    {
        System.out.print("0 ");
        System.out.print("1 ");
        Fibonacci( 10 , 0,1);
        
    }
}
