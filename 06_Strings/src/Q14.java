
//Converting to uppercase and lowercase

import java.util.*;

class Q14
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String s = in.nextLine();
		
		//To upper case
		System.out.println("To upper case: " + s.toUpperCase());
		
		//To lower case
		System.out.println("To lower case: " + s.toLowerCase());
	}
}