
//Splitting strings with split()

class Q11
{
	public static void main(String[] args)
	{
		//split()
		//splits this string against given regular expression and returns a char array
		
		String s = "This is my book";
		String swords1[], swords2[];
		System.out.println("Actual string: " + s);
		System.out.println();
		
		//String split(String regex)
		swords1 = s.split(" ");
		for(String i:swords1)
			System.out.println(i);
		
		System.out.println();
		
		//String split(String regex, int limit)
		swords2 = s.split(" ", 2);
		for(int i=0;i<swords2.length;i++)
			System.out.println(swords2[i]);
	}
}