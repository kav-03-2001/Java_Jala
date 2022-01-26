
//Different ways creating a string

class Q01
{
	public static void main(String[] args)
	{
		char[] ch={'a','d','i','t','h','y','a'};
		//converting char array to string
		String s=new String(ch);
		
		//method1: String literal
		String s1="String literal";
		System.out.println(s1);
		
		//method2: new keyword
		String s2=new String("new keyword");
		System.out.println(s2);
	}
}