
//Write a program to find Armstrong number or not

import java.util.*;

class Q08
{
	//to return power of a number up to digit times
	static int powSum(int last, int digits)
	{
		int pSum = last;
		for(int i=1;i<digits;i++)
			pSum = pSum * last;
		return pSum;
	}
	
	static boolean isArmstrong(int n)   
	{   
		int temp, digits=0, last=0, sum=0;
		temp=n;
		//to calculate number of digits in a number
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;
		//to calculate sum of power of a number up to digit times
		while(temp>0)   
		{  
			last = temp % 10;
			sum = sum + powSum(last, digits); 
			temp = temp / 10;   
		} 
		if(n == sum)
			return true;
		else
			return false;   
	}
	
	public static void main(String[] args)
	{
		int num;   
		Scanner in = new Scanner(System.in);  
		System.out.print("num = ");
		num=in.nextInt();
		if(isArmstrong(num))
			System.out.print("Armstrong number");
		else
			System.out.print("Not an Armstrong number");
		
	}
}
