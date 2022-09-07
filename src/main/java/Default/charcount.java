package Default;

public class charcount {

	public static void main(String[] args) {
		
		String s2="Hi welcome to thinkitive";
		
		//count2(s2);
		//count();
		whitespce();
		space();
	}
	
	public static void count()
	{
		String s1=" India is a Great Country";
		
		System.out.println(s1.length());
	}
	
	
	public static void count2(String s2)
	{
		System.out.println(s2.length());
	}
	
	public static void whitespce()
	{
		String s3= "sanket diwan";
		char[]a;
		
		a=s3.toCharArray(); // This will covert string to char array
		int count=0; 
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
		//System.out.println(s3.charAt(6));
		//System.out.println(s3);
	}
	
	public static void space()
	{
		String s1="Hi there";
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
		
	}

}
