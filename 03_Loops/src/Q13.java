
//Program for multiple if else statement(Largest number in 10,20 and 30)

class Q13
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		if((num1 > num2) && (num1 > num3))
			System.out.println("Largest number is " + num1);
		else if((num2 > num3) && (num2 > num1))
			System.out.println("Largest number is " + num2);
		else
			System.out.println("Largest number is " + num3);
		
	}
}
