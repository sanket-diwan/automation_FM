package Default;

import java.util.Scanner;

import org.apache.poi.ss.formula.atp.Switch;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i;
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for (i=1;i<n;i=i+2)
		{
			System.out.println(i);
			//break;
		
		}*/
		Loops.array();
		Loops.india();
	}
	
	public static void array()
	{
		/*int[]number= {10,20,30,40,50};
						//{100,90,80,70,60},
		
		for( int i: number)
		{
			System.out.println(i);
		}*/
	
	}
	
	public static void india()
	{
		int i=1;
		do
		{
			switch(i) {
				
			case 1: System.out.println("india");
			break;
			case 2: System.out.println("is");
			break;
			case 3: System.out.println("a");
			break;
			case 4: System.out.println("great");
			break;
			case 5: System.out.println("country");
			break;
			};
			
			i++;
			}
			while(i<=5);
		}

	}


