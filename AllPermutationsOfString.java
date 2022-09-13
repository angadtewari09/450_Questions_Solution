import java.util.*;
public class Main
{
    static ArrayList<String> list = new ArrayList<>();
    public static void getPermutations( String str , String answer )
    {
        if( str.length() == 0 ) {
                list.add( answer );
                return;
            }
            
        for( int i = 0; i< str.length(); i++ )
        {
            
            String left = str.substring( 0 , i );
            String right = str.substring( i+1 );
            String total = left + right;
            getPermutations( total , answer + str.charAt(i) );
        }
        
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        String str = sc.nextLine();
        getPermutations( str , "" );
        System.out.println( list );
    }
}
