
public class Main 
{

	public static void main(String[] args) 
	{
		//Create an object for each class A, B and C
		A a = new A();
		B b = new B();
		C c = new C();

		//call every method of each class using its own object/instance
		
		a.A_method_1();
		a.A_method_2();
		a.override();
		
		b.B_method_1();
		b.B_method_2();
		b.override();
		
		c.C_method_1();
		c.C_method_2();
		c.override();
		
		//Call an overridden method with super class reference to B and C class’s objects
		
		A aa = new B();
		aa.override();
		
		A aaa = new C();
		aaa.override();
		
	}

}
