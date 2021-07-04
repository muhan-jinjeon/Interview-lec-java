package logic;

//1+2/2!+3/3!+4/4!=1+1+1/2+1/6             numerator=1+2+3+4=10  denominator=1+2+6+24=33
public class Series9 {
	public static void main(String args[]) {
		int sum = 0, count = 1, s;
		for (int i = 1; i <= 4; i++) {
			sum = sum + i; // 1 3 6 10
			
			}
		for (int j = 1; j <= 4; j++) {
			count += count * j; // 1+2+6+24=33
			s = sum / count;
			// System.out.print(count+"count= ");
			// System.out.print(sum+"sum= ");
			// System.out.print("fact ="+fact);
		}
		
		System.out.println("series=" + sum);
		System.out.println("series=" + count);

	}
}
