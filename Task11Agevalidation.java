package javamaven1;

import java.util.Scanner;



public class Task11Agevalidation {
	
	public static void validateAge(int age) throws Task11Invalidageexcep{
		if(age<18) {
			throw new Task11Invalidageexcep("You must be at least 18 years to vote");		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age =sc.nextInt();
		
		
		
		try{
			validateAge(age);
			System.out.println("You are eligbli to vote!");
			}
		catch(Task11Invalidageexcep e) {
			System.out.println("Error: "+ e.getMessage());			
		
			sc.close();	
		}
		
		

	}

}
