
//Converting integer objects to Strings

class Q13
{
	public static void main(String[] args)
	{
		
        // Method 1 :
        int a = 10;
        String aa = String.valueOf(a);
        System.out.println(aa);

        // Method 2 :
        int b = 20;
        String bb = Integer.toString(b);
        System.out.println(bb);

        // Method 3 :
        int c = 30;
        String cc = String.format("%d", c);
        System.out.println(cc);
	}
}