package Default;

import java.util.Scanner;

public class Stringops {

	public static void main(String[] args) {
	//	int marks=66;
		
		/*Scanner sc= new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks<35)
		{
			System.out.println("you are fail");
		}
		else if (marks>=35 && marks<=75)
		{
			System.out.println("you are good student");
		}
		else {
			System.out.println("you are bright student");
		}*/
		
		
		switchcase();
	}
	
	public static void switchcase() 
	{
		Scanner sc= new Scanner(System.in);
		int month=sc.nextInt();		
		switch(month)
		{
		case 1: System.out.println("oh its january");
		break;
		
		case 2: System.out.println("oh its february");
		break;
		
		case 3: System.out.println("oh its march");
		break;
		
		case 4: System.out.println("oh its April");
		break;
		
		case 5: System.out.println("oh its may");
		break;
		
		case 6: System.out.println("oh its june");
		break;
		
		case 7: System.out.println("oh its july");
		break;
		
		case 8: System.out.println("oh its August");
		break;
		
		case 9: System.out.println("oh its september");
		break;
		
		case 10: System.out.println("oh its october");
		break;
		
		case 11: System.out.println("oh its November");
		break;
		
		case 12: System.out.println("oh its December");
		break;
		
		default:
		
		System.out.println("enter a valid month number");
		
		}
	}
	public static void switchmarks()
	{
		Scanner sc= new Scanner(System.in);
		int mark=sc.nextInt();	
		
		if(mark==35||mark>=75) {
		switch(mark)
		{
		case 1: System.out.println("oh its january");
		break;
		
		case 2: System.out.println("oh its february");
		break;
		
		case 3: System.out.println("oh its march");
		break;
	}
		
		}
	}
}
