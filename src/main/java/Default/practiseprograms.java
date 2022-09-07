package Default;

import java.util.Iterator;
import java.util.Scanner;

public class practiseprograms {

	public static void main(String[] args) {
		
		//practiseprograms.oddeven();
		//practiseprograms p= new practiseprograms();
	//	p.newman();
	//	switchexample();
		ciaz();
		loops();
		
	}
	
	private static void oddeven()
	{
		
		System.out.println("Enter number");
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("It is Even number");
		}
		else
		{
			System.out.println("It is odd number");
		}
	}
	
	public static String newman()
	{
		String s="sanket";
		String s1="diwan";
		String S2=s.concat(s1);
		System.out.println(S2);
		return S2;
	}
	
	public static void switchexample()
	{
		int a=1;
		
		switch (a) {
		
		case 1: System.out.println("its january");
			
			break;
			
		case 2: System.out.println("its february");
		
		break;
		
		case 3: System.out.println("its march");
		default:
			break;
		}
	}
	
	public static void ciaz()
	{
		String s1=" sanket diwan QA engineer";
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
		System.out.println(s1.length());
	}
	
	public static void loops()
	{
		int arr[]= new int[5];
		
		 arr[0]=83;
		 arr[1]=394;
		 arr[2]=4;
		 arr[3]=34;
		 arr[4]=43;
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			
			 System.out.println(arr[i]);
		}
		 
		 String s1="sanket";
		 System.out.println(s1.length()+ "*");
		
		
		 String s[]= {"sanket","Saurabh","Nimish"};
		 
		 for(String s9:s)
		 {
			 System.out.println(s9);
		 }
	}
	
}
