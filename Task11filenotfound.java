package javamaven1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task11filenotfound {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	   FileReader reader =new FileReader("file.txt");
	
		
		BufferedReader br =new BufferedReader(reader);
		
		//declaring empty string passing null
		String data = null;
		
		// while loop to read print data
		while((data= br.readLine())!=null)
		{
			System.out.println(data);			
		}
		
		//closing the buffer reader
		
		try {
			br.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
 	}

}
