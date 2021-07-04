package logic;

//import java.util.Scanner;

public class Series1 {
	public static void main(String args[]) {
		int n = 10, count = 0;
		System.out.println("First" + n + "numbers");
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter a number");
//	n=s.nextInt();
		for (int i = 1; i <= 9; i++) {
			if(i==9) {
				System.out.print(i);
			}
			else {
			System.out.print(i + " + ");
			
			}
			count = count + i;
		}

		System.out.println("=" + (count));
	}
}
