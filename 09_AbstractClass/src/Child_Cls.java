
//Create a sub class for an abstract class.
//Create an object in the child class for the abstract class and access the non-abstract methods

//Create an instance for the child class in child class and call abstract methods

//Create an instance for the child class in child class and call non-abstract methods

public class Child_Cls extends Abs_Cls
{
	void method1()
	{
		System.out.println("Abstract method of abstract class");
	}
	
	public static void main(String args[])
	{
		Child_Cls cc = new Child_Cls();
		Abs_Cls ac = new Child_Cls();
		
		cc.method2();
		ac.method1();
		cc.method1();
	}
}
