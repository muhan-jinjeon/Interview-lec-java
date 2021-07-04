package control;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int a , b , c ;
		System.out.println("Enter three numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("Largest number is :"+a);
			
		
		}
		else if(b>c) {
			System.out.println("Largest number is :"+b);
		}
		
		else {
			System.out.println("Largest number is :"+c);
			
		}
		
	}

}
