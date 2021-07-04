package control;

public class DecimalBinary {
	
	//2(0)     2(1)    2(2)
	// 12.2        8  4  2  1
	public static void ToBinary(int decimal) {
//	float a=0;
//		float num=10 ;
//		float mod;
//		while(num > 0) {
//		 mod=num % 2;
//			num=num / 2;
		
			int index=0;
			int binary[]=new int[40];
			//System.out.println(Integer.toBinaryString(10));
		while(decimal>0) {
			binary[index++]= decimal%2;
			decimal=decimal/2;
			
			
			
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
			
		}
		public static void main(String args[]) {
			System.out.println("decimal:");
			ToBinary(10);
		}
	}


