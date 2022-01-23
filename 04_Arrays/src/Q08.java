
//Write a function to find the minimum and maximum value of an array

class Q08
{
	static int[] min_max(int[] arr)
	{
		int[] pair = new int[2];
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;
				}  
			}
		}
		pair[0] = arr[0];
		pair[1] = arr[arr.length-1];
		return pair;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] pair = min_max(arr);
		System.out.println("Elements in array are");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nMinimum is " + pair[0]);
		System.out.println("Maximum is " + pair[1]);
	}
}
