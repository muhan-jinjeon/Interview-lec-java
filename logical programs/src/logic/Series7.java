package logic;
//0+3+8+15+24+....n=50
public class Series7 {
   public static void main(String args[]) {
	   int n = 10, count = 0,  sum=0;
		for (int i = 3; i <= n; i++) {
			if (i % 2 == 1) {
				
				count = count + i; // 0+3+5+7+9+24=
			}
			
			else {
				continue;
			}
			
			
			System.out.print( count+ "+");
			sum=sum+count;
		}
		System.out.print("="+sum);
   }
}
