package Default;

public class differentmethod {

	public static void main(String[] args) {
		// here object of class is created.
		differentmethod d=new differentmethod(); 
	    //  calling method with object
		d.divide(90, 15);
		//differentmethod.addition();     
		//differentmethod.mutiply(9, 7);
		//differentmethod.substract();              // we can call method using class name
		d.multples(9, 7);
		
	}
	
		public static void addition()                //Method without return type and without parameters
		{
			int a=10;
			int b=20;
			
			int add= a+b;
			
			System.out.println(add);
		}
	
		public static void mutiply(int c,int d)   //Method without return type and with parameters
		{		
			int multi=c*d;
		
			System.out.println(multi);
		}
		
		public static int substract()			//Method with returns type and without parameters
		{
			int a=99;
			int b=98;
			
			int sub=a-b;
			System.out.println(sub);
			return sub;
		}
		
		public static int divide(int p,int q)  //Method with return type and with parameters
		{
			int r= p/q;
			
			System.out.println(r);
			return r;
		}
		
		public int multples(int w, int y)  //To call non static method object creation is required
		{
			int x=w*y;
			System.out.println(x);
			return x;
		}

}
