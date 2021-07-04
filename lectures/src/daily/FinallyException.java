package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyException {
	public static void main(String args[]) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		System.out.println("Enter your name:");
		try {
			String str=br.readLine();
			System.out.println("Your name is "+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally block executed");
			
			
		}
		System.out.println("world");
		
	}

}
