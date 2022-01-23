
//Write a function to test if array contains a specific value

class Q04
{
	static boolean check(int arr[], int value)
    {
        int len = arr.length;
        int i = 0;
        while (i < len) 
        {
            if (arr[i] == value)
                return true;
            else
            	i++;
        }
        return false;
    }
	
	public static void main(String[] args)
	{
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int n = 11;
        if(check(arr, n))
        	System.out.println("Yes! array contain " + n);
        else
        	System.out.println("No! array doesn't contain " + n);
		
	}
}
