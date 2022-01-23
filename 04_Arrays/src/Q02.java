
//Write a function to calculate the average value of an array of integers

class Q02
{
	static int average(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum = sum + arr[i];
		int avg = sum / arr.length;
		return avg;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40, 50};
		System.out.print("average of ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + ", ");
		System.out.print(" =  " + average(arr));
	}
}
