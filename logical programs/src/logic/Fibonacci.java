package logic;
//0 1  1  2  3  5

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1=0 , num2=1;
		int N=10;
		int counter=0;
		while(counter < N) {
		 	System.out.println(num1+" ");
		 	
		 	int num3=num1+num2;
		 	num1=num2;
		 	num2=num3;
		 	counter=counter+1;
		 	
		}
	}

}
