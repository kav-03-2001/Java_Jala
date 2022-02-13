
//Create a class with PRIVATE fields, private method and a main method. Print the fields in main method.
//Call the private method in main method.

class Q01
{
	private int i = 10;
	
	
	private void method()
	{
		System.out.println("private method");
	}
	
	public static void main(String[] args)
	{
		Q01 obj = new Q01();
		
		//printing the fields in main method
		System.out.println(obj.i);
		
		//Calling private method
		obj.method();
	}

}

//Create a sub class and try to access the private fields and methods from sub class.
//Note: we cannot access private fields from another class.
//Hence not possible.

