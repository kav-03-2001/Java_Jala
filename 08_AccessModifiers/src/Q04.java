
//Access the public methods and fields from any class in the same package or different package.

public class Q04 
{

	public static void main(String[] args) 
	{
		Q04_public obj = new Q04_public();
		
		//Accessing public fields from Q04_public class in the same package
		System.out.println(obj.i);
				
		//Accessing default method from Q4_public class in the same package
		obj.method();

	}

}
