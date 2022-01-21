
//Program for relational operators (<,<==, >, >==)

import java.util.*;

class Q6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.print("num1 = ");
		num1 = in.nextInt();
		System.out.print("num2 = ");
		num2 = in.nextInt();
		
		if(num1 < num2)
			System.out.println(num1 + " < " + num2);
		else if(num1 <= num2)
			System.out.println(num1 + " <= " + num2);
		else if(num1 > num2)
			System.out.println(num1 + " > " + num2);
		else if(num1 >= num2)
			System.out.println(num1 + " >= " + num2);
	}

}
