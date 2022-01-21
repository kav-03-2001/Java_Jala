
//Define the local and Global variables with the same name and print both variables and understand the scope of the variables

class Q5
{
	static int var=100;	//static variable - declared as static
    static int method()  
    {    
        int var=90;		//local variable - inside the body of the method
        return var;
    } 
	public static void main(String[] args)
	{
		Q5 obj = new Q5();
		int var=50;		//instance variable - inside the class but outside the body of the method
		System.out.println("Instance variable: " + var);
		System.out.println("Local variable: " + method());
		System.out.println("Static variable: " + obj.var);
	}
}


//Note: There is no concept of global variables in java