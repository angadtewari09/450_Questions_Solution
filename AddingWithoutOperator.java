//Adding two numbers without using Addition Operator.
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be added:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while( b!= 0 )
        {
            int temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }
        System.out.println(a);
    }
}
