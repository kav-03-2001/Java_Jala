
//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

class Q08
{
	public static void main(String[] args)
	{
		String s1 = "adithya";
		String s2 = "Adithya";
		String s3 = "ADITHYA";
		String s4 = "adithya vardhan";
		
		//equalsIngnoreCase(String str)
		//It returns true if characters of both strings are equal, ignoring case otherwise false.
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s1.equalsIgnoreCase(s4)); //false
		
		//startsWith()
		//checks if this string starts with the given prefix.
		//It returns true if this string starts with the given prefix; else returns false.
		System.out.println(s2.startsWith("Ad"));   //true
		System.out.println(s1.startsWith("ad",0)); //true
		System.out.println(s1.startsWith("ad",3)); //false
		
		//endswith()
		//checks if this string ends with a given suffix.
		//It returns true if this string ends with the given suffix; else returns false.
		System.out.println(s4.endsWith("vardhan")); //true
		System.out.println(s4.endsWith("an")); //true
		System.out.println(s4.endsWith("kotha")); //false
		
		//compareTo()
		//compares the given string with the current string lexicographically.
			//if s1 > s2, it returns positive number  
			//if s1 < s2, it returns negative number  
			//if s1 == s2, it returns 0
		String s5="hello";  
		String s6="hello";  
		String s7="meklo";  
		String s8="hemlo";  
		String s9="flag";  
		System.out.println(s5.compareTo(s6));//0 because both are equal  
		System.out.println(s5.compareTo(s7));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s5.compareTo(s8));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s5.compareTo(s9));//2 because "h" is 2 times greater than "f"  
	}
}