
/*
1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
2. Print instance variables in static methods
3. Print static variables in Instance methods
4. Call instance methods in static methods
5. Call static methods in instance methods
6. Print all the static, instance variables in main method
7. Call static methods and instance methods in main method
 */

class Q 
{
	//2 static variables
	static int a = 10;
	static int b = 20;
	
	//2 instance variables
	int c = 30;
	int d = 40;
	
	//Static method 1
	static void stmethod1()
	{
		Q obj = new Q();
		//printing instance variable in static method
		System.out.println("static method 1, c = " + obj.c);
		//calling instance method in static method
		obj.insmethod1();
	}
	
	//Static method 2
	static void stmethod2()
	{
		Q obj = new Q();
		//printing instance variable in static method
		System.out.println("static method 2, d = " + obj.d);
		//calling instance method in static method
		obj.insmethod2();
	}
	
	//Instance method 1
	void insmethod1()
	{
		System.out.println("instance method 1, a = " + a);
		//calling static method in instance method
		stmethod1();
	}
	
	//Instance method 2
	void insmethod2()
	{
		System.out.println("instance method 2, b = " + b);
		//calling static method in instance method
		stmethod2();
	}
	
	//main method
	public static void main(String[] args)
	{
		Q obj = new Q();
		
		//Printing static variables
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//Printing instance variables
		System.out.println("c = " + obj.c);
		System.out.println("d = " + obj.d);
		
		//calling static methods
		stmethod1();
		stmethod2();
		
		//calling instance methods
		obj.insmethod1();
		obj.insmethod2();
		
	}

}
