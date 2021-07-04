package logic;
//1-2 +3-4 + 5-6 +7-8 = -4
public class Series3 {

	public static void main(String[] args) {
		int n=6, num1=0,num2=0, count=0;
		System.out.println("First " +n+ " numbers");

		for(int i=1 ; i<=n ;i++) {
			if(i%2==0)
				num1=i+num1; //  even
			else {
				num2=i+num2;//odd
			}
			
			//int e=num1;
			//int o=num2;
			count=num2-num1;//  odd-even
			//System.out.print(e);
			//System.out.print(o);
			
		}
			
			
		//count= -(n/2);
		System.out.println( "=" + (count) );	

		}
		
		

	}


