package logic;

//1*1+2*2+3*3=14
public class Series4 {

	public static void main(String[] args) {
		double s = 0;
		for (int i = 1; i <= 5; i++) {
			s = s + i * i;
			
		}

		System.out.println("series:" + s);
	}

}
