
//Concatenating two strings using + operator

import java.util.*;

class Q02
{
	public static void main(String[] args)
	{
		String s1,s2,s;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first name: ");
		s1 = in.nextLine();
		System.out.print("Input last name: ");
		s2 = in.nextLine();
		s = s1 + ' ' + s2;
		System.out.println("Full name is: " + s);
		
	}
}