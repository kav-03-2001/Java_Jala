
//Replacing characters in strings with replace()

class Q10
{
	public static void main(String[] args)
	{
		String s = "This is my book";
		System.out.println("actual string: " + s);
		
		//replace()
		//returns a string replacing all the old char or CharSequence to new char or CharSequence
		
		//String replace(CharSequence target, CharSequence replacement)    
		System.out.println("replaced string: " + s.replace("is", "was"));
		
		//public String replace(char oldChar, char newChar)
		System.out.println("replaced string: " + s.replace('i', 'w'));
	}
}