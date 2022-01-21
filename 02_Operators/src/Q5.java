
//Programs on Logical AND,OR operator and Logical NOT

class Q5
{
	public static void main(String[] args)
	{
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = 10;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		//using Logical AND operator (&&)
		if((num1 < num2) && (num1 == num3))
			System.out.println("Statement is True");
		else
			System.out.println("Statement is False");
		
		//using Logical OR operator (||)
		if((num1 > num2) || (num1 != num3))
			System.out.println("Statement is True");
		else
			System.out.println("Statement is False");
				
		//using Logical NOT operator (!)
		if(!(num1 > num2))
			System.out.println("Statement is True");
		else
			System.out.println("Statement is False");
	}

}
