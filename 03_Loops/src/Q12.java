
//Print gender (Male/Female) program according to given M/F using switch

import java.util.*;

class Q12
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		char c;
		System.out.print("Enter a character (M / F): ");
		c = in.next().charAt(0);
		
		switch (c)
		{
		case 'm':
		case 'M':
			System.out.println("Male");
			break;
		case 'f':
		case 'F':
			System.out.println("Female");
			break;
		}
		
	}
}
