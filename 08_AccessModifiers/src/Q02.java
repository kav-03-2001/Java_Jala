
//Create a class with DEFAULT fields and methods.
//Access these fields and methods from any other class in the same package


//Note: If you don't use any modifier, it is treated as default by default.

class Q02_def
{
	int i = 10;
	
	void method()
	{
		System.out.println("class Q02_def - default method");
	}
}

class Q02
{
	public static void main(String args[])
	{
		Q02_def obj = new Q02_def();
		
		//Accessing default fields from Q02_def class in the same package
		System.out.println(obj.i);
		
		//Accessing default method from Q02_def class in the same package
		obj.method();
	}
	
}