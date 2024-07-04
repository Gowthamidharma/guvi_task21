package javamaven1;

import java.util.Scanner;

public class Task11int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			// declare 
			int a,b,c;
			
			Scanner KB  = new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=KB.nextInt();
       
			System.out.print("Enter second number : ");
			b=KB.nextInt();
			
			KB.close();
			
       
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide number  "+e.getMessage());
			System.out.println("Error:"+e);
		}
		
	}
	
	

		
		
	}


