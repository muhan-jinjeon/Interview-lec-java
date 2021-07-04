package logic;

import java.util.Scanner;

//add sub mul div
public class SwitchCase {
	public static void main(String args[]) {
		
		int x = 4, y = 3;
		int a, b, c, d;
		char op;
		Scanner s = new Scanner(System.in);
		op = s.next().charAt(0);
		switch (op) {
		case '+':
			a = x + y;
			System.out.println("add" + a);
			break;
		case '-':
			b = x - y;
			System.out.println("sub" + b);
			break;
		case '*':
			c = x * y;
			System.out.println("mul" + c);
			break;
		case '/':
			d = x / y;
			System.out.println("div" + d);
			break;
		}
	}
}
