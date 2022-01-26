
//Matching a String Against a Regular Expression With matches()

class Q06
{
	public static void main(String[] args)
	{
		String Str = "Kotha Adithya Vardhan";
  
        //Does String contains regex (.*)Adithya(.*)
        System.out.println(Str.matches("(.*)Adithya(.*)"));
  
        //Does String contains regex (.*)Adithya
        System.out.println(Str.matches("(.*)Adithya"));
        
        //Does String contains regex Adithya
        System.out.println(Str.matches("Adithya"));
        
        //Does String contains regex Kotha(.*)
        System.out.println(Str.matches("Kotha(.*)"));
	}
}