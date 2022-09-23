class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if( nums.length == 1 )
            return 1;
        int i = 0 , count = 0 , j= 1;
        for( int x = 0;x< nums.length; x++ )
        {
            if( nums[i] != nums[x] ) {
                nums[j++] = nums[x];
                i = x;
                count+=1;
            }
        }
        return count+1;
    }
}
