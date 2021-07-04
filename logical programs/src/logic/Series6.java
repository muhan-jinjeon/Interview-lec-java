package logic;

//2+5+10+17+26....+n=   3  5  7  9       
public class Series6 {
	public static void main(String args[]) {
		int n = 10, count = 2,  sum=0;
		for (int i = 3; i <= n; i++) {
			if (i % 2 == 1) {
				
				count = count + i; // 2+3+5+7
			}
			
			else {
				continue;
			}
			if(i==9) {
				System.out.print( count+ " ");
			}
			else
			System.out.print( count+ "+");
			sum=sum+count;
		}
		
		System.out.print("="+sum);
	}

}
