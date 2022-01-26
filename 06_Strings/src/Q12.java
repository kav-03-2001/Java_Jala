
//Converting Numbers to Strings with valueOf()

class Q12
{
	public static void main(String[] args)
	{
		byte by = 10;
		short s = 15;
		long l = 15L;
		int i = 20;
		boolean b = false;
		char c = 'a';
		char[] ch = {'k','a','v'};
		float f = 40.05f;
		double d = 30.02;
		Q12 obj = new Q12();
		
		String s1 = String.valueOf(by);    
        String s2 = String.valueOf(s);    
        String s3 = String.valueOf(l);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(b);    
        String s6 = String.valueOf(c);    
        String s7 = String.valueOf(ch);    
        String s8 = String.valueOf(f);    
        String s9 = String.valueOf(d);
        String s10 = String.valueOf(obj);
        
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9);
        System.out.println(s10);
	}
}