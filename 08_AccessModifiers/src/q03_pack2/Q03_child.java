
//Also, Access the PROTECTED fields and methods from child class located in a different package

package q03_pack2;

import q03_pack1.*;

public class Q03_child extends Q03_prot
{
	public static void main(String[] args)
	{
		Q03_child obj = new Q03_child();
		
		//Accessing protected fields from Q03_prot class in a different package
		System.out.println(obj.i);
		
		//Accessing protected method from Q03_prot class in a different package
		obj.method();
	}
}
