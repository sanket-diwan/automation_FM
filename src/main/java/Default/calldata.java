package Default;

import java.util.Scanner;

public class calldata {
	
	static int a=10;
	static String s="sanket";

	public static void main(String[] args)throws Throwable {
		
		double s=10.8;
		
		int []c= {10,20,30};
		String s0="india";
		String s1="is my ountry";
		String s2=s0.concat(s1);
		
		
		Scanner sc=new Scanner(System.in);
		String T=sc.nextLine();
		
		String arr[][]= new String[2][3];
		
		arr[0][0]= "1";
		arr[0][1]="sanket";
		

	//	calldatatypes();
		printarray(c,s2);
		twodarray();
	}
	
	public static void calldatatypes() throws Throwable
	{
		System.out.println(a);
		System.out.println(s);
	}
	
	public static void printarray(int[]c,  String s2)
	{
		//System.out.println(T);
		
		System.out.println(s2);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	public static void twodarray()
	{
		String s1=" india is a great coutry";
		
		System.out.println(s1.length());
		
	}

}
