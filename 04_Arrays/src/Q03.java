
//Write a program to find the index of an array element

class Q03
{
	static int findIndex(int arr[], int value)
    {
        int len = arr.length;
        int i = 0;
        while (i < len) 
        {
            if (arr[i] == value)
                return i;
            else
                i++;
        }
        return -1;
    }
	
	public static void main(String[] args)
	{
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.println("Index position of 5 is: " + findIndex(arr, 5));
        System.out.println("Index position of 10 is: " + findIndex(arr, 10));
		
	}
}
