package C1708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;



public class Checkedexception {

	public static void main(String[] args) {
		//read the character data
		BufferedReader br=null;
		Reader r=new InputStreamReader(System.in);
		br=new BufferedReader(r);
		String str;
		try {
			do {
				System.out.println( "Enter something");
				str=br.readLine();
				System.out.println("What you have entered is "+str);
				//! in while is used to run the code continuously till the exit is entered
			}while(!str.equalsIgnoreCase("exit"));
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			
						
				
			
			}
		}
		
		
		

	}

}
