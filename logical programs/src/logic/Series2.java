package logic;
//1*2*3=6
public class Series2 {
	public static void main(String args[]) {
		double  n=10, count=1;
		System.out.println("First" +n+ "numbers");

		for(int i=1 ; i<=4 ;i++) {
			System.out.print(i + " * ");
		count=count*i ;
			
			
		}
		
		System.out.println( "=" + (count) );	
	}
}


