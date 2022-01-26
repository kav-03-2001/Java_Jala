
//Searching in strings using indexOf()

class Q05
{
	public static void main(String[] args)
	{
		String s = "kotha adithya vardhan";
				
		//type-1: int indexOf(int ch)
		//returns the index position for the given char value
		System.out.println(s.indexOf('a'));
		
		//type-2: int indexOf(int ch, int fromIndex)
		//returns the index position for the given char value and from index
		System.out.println(s.indexOf('a',5));
		
		//type-3: int indexOf(String substring)
		//returns the index position for the given substring
		System.out.println(s.indexOf("adi"));
		
		//typoe-4: int indexOf(String substring, int fromIndex)
		//returns the index position for the given substring and from index
		System.out.println(s.indexOf("ha",5));
	}
}