package logic;

public class Primeno {
	static void countPrime() {
		int num = 0, i;
		String s = "";

		for (i = 1; i <= 100; i++) {
			int f1 = 0;
           
			for (num = i; num >= 1; num--) {    //7      7 6 5 4 3 2 1
				if (i % num == 0) {
					f1 = f1 + 1;  //2
                       			
					}
			}
			if (f1 ==2) {   // prime number divisible only by 2 numbers ,  1 and itself
			s = s + i + " ";

			}
		}
		System.out.println("prime number:"+s);
		
	}

	public static void main(String args[]) {
		countPrime();
	}
}
