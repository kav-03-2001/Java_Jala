
//Extract a string using Substring

import java.util.*;

class Q04
{
	public static void main(String[] args)
	{
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		s = in.nextLine();
		
		//type-1 substring (start from index)
		System.out.println(s.substring(2));
		
		//type-2 substring (start from index, end at index)
		System.out.println(s.substring(2,5));
	}
}