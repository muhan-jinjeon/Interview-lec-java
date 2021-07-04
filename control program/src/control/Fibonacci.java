package control;

public class Fibonacci {
	
	public static void main(String[] args) {
		
    int n=10;
    int num1=0 , num2=1 ;
   
    int num3, i;
    System.out.println("fibonacci series:"+num1);//0
	 System.out.println("fibonacci series:"+num2);//1

    
     for(i=0 ; i<=9 ; i++) {
    	
    	num3=num1+num2;
    	num1=num2;
    	num2=num3;
    	
    	 System.out.println("fibonacci series:"+num3); 
    	
     }
     
    
	 
	 
	}

}
