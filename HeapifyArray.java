
public class Main
{
    static int arr[] = {12,20,2,13,32,50,88,21,18,91};
    public static void downshift( int arr[] , int i )
    {
            int largest = i;
            int L = 2*i + 1;
            int R = 2*i + 2;
            if( L<arr.length && arr[L] > arr[i] )
                largest = L;
 
            if( R<arr.length && arr[R] > arr[largest] )
                largest = R;
            
            if( largest != i )
            {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                
                downshift( arr , largest );
            }
    }
    public static void heapify( int arr[] )
    {
        for( int i = (arr.length/2 - 1); i>=0; i-- )
        {
            
            downshift( arr , i );
        }
    }
    public static void printarr(int arr[])
    {
        for(int i = 0; i< arr.length; i++ )
            System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) 
	{
	    System.out.println("Before heapify:");
	    printarr(arr);
	    heapify( arr );
	    System.out.println("\nAfter heapify:");
	    printarr(arr);
	}
}
