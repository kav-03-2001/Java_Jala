
//Trimming strings with trim()


class Q09
{
	public static void main(String[] args)
	{
		//trim()
		//eliminates leading and trailing spaces
		//doesn't omit middle spaces.
		
		String name = "  kotha  adithya vardhan  ";
		System.out.println(name.length() + name); //without trim
		System.out.println(name.trim().length() + name.trim());
	}
}