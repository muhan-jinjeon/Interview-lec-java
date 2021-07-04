package logic;

import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		int N;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		N=s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + "*" + i + "=" + N * i);

		}
	}
}
