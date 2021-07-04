package daily;

import java.util.Scanner;

public class ExceptionTest {
	static void exception1() {
		String str = "hi";
		// int num = 0;
		int num = Integer.parseInt(str); // number format exception
		System.out.println(num);
	}

	static void exception2() {
		int arr[] = { 5, 6, 7 };
		System.out.println(arr[2]); // array index out of bound
	}

	static void exception3() {
		Scanner s = null;
		// Scanner s1=new Scanner(System.in);
		System.out.println("enter string");
		int num = s.nextInt(); // null pointer
		System.out.println(num);
	}

	public static void main(String args[]) {
		try {
//			//exception1();
//			//exception2();
			exception3();
//		} catch (Exception el) {
		// el.printStackTrace();
//			System.out.println("exception");
//		} catch (ArrayIndexOutOfBoundsException b) {
//			System.out.println("arrayoutofboundexception");
		} catch (NullPointerException c) {
			System.out.println("nullpointerexception");
//		try {
//exception3();
//		} catch (Exception e) {
//			System.out.println("Exception");
//			
		}
	}
}
