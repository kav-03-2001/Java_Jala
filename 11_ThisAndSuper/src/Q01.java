
//Print the fields/instance members of the current class using this and without using object

public class Q01 
{
	int var = 10;
	
	void print()
	{
		int var = 100;
		System.out.println(this.var);
	}
	
	public static void main(String[] args) 
	{
		
		Q01 a = new Q01();
		a.print();
		

	}

}
