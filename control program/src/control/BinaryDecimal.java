package control;

public class BinaryDecimal {

	public static void main(String args[]) {
		int i = 0, decimal = 0;
		int binary = 1010;
		while (true) {
			if (binary == 0) {   //1010    101    10   1
				break;
			}
			else {
			int temp = binary % 10;  // 0   1    0   1
			decimal += temp * Math.pow(2, i); //  0    2   0   8
			binary = binary / 10;   // 101   10    1
			i++;
			}
			
		}
		System.out.println("Decimal=" + decimal);
	}
}
