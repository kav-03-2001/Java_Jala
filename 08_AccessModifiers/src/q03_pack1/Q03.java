
//Access these fields and methods from any other class in the same package.

package q03_pack1;

public class Q03
{
	public static void main(String args[])
	{
		Q03_prot obj = new Q03_prot();
		
		//Accessing protected fields from Q03_prot class in the same package
		System.out.println(obj.i);
		
		//Accessing protected method from Q03_prot class in the same package
		obj.method();
	}
}
