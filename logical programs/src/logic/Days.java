package logic;

import java.util.Scanner;

public class Days {
	public static void main(String args[]) {
		
		int a,b,c,d,e,f,z;
		Scanner s=new Scanner(System.in);
		z = s.next().charAt(0);
		switch(z) {
		
		case 'a':
			System.out.println(" Sunday ");
			break;
		case 'b':
			System.out.println(" Monday ");
			break;
		case 'c':
			System.out.println(" Tuesday ");
			break;
		case 'd':
			System.out.println(" Wednesday ");
			break;
		case 'e':
			System.out.println("Thursday ");
			break;
		case 'f':
			System.out.println(" Friday ");
			break;
			default:
				System.out.println("Saturday");
		
		}
	}
	

}
