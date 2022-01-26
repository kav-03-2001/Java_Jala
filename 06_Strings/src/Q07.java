
//Comparing strings using the methods equals()

import java.util.*;

class Q07
{
	public static void main(String[] args)
	{
		//equals() method compares the two given strings based on the content of the string.
		//If any character is not matched, it returns false. 
		//If all characters are matched, it returns true.
		
		String s1 = "adithya";
		String s2 = "adithya";
		String s3 = "Adithya";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		if(s1.equals(s3))
			System.out.println(s1 + " == " + s3);
		else
			System.out.println(s1 + " != " + s3);
	}
}