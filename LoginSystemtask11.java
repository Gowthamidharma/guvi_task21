package javamaven1;

import java.util.Scanner;


public class LoginSystemtask11 {
	String username;
	
	String password;
	
	public LoginSystemtask11(String user,String pword) {
		username=user;
		password=pword;
		
	}
	
	public void login(String username, String password) throws Incorrectpasswordexception {		 
		 
		if(!this.password.equals(password)) {	
			throw new Incorrectpasswordexception("Incorrect passwod!");
		
		}
		else if(!this.username.equals(username)) {
			System.out.println("User not found!");
			
		}
		else {
			System.out.println("Login successful!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		
		LoginSystemtask11 obj= new LoginSystemtask11("Admin","admin@123");
		
		try {			
		   obj.login(username, password);
		   System.out.println("Sucessful loginAd");
			
		} catch (Incorrectpasswordexception e) {
			System.out.println("Error: " + e.getMessage());
			
			// TODO: handle exception
		}
		sc.close();

	}

}
