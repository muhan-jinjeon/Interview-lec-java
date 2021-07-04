package logic;

//1!+2!+3!..n!=9
public class Series8 {
	public static void main(String args[]) {
		int sum = 1 , count=0 , i;
		for (i = 1; i <= 5; i++) {
			
			
			
			sum =  sum * i;   //1+(2*1)+(3 2 1)+(4321)+(54321)=1+2+6+24+120=153
			
			
			
			System.out.print(i+"!+");
			count=count+sum;
		}
	
		
		
		System.out.println("="+count);
	}
	
}
