package program1;

public class Salary {
	public static void main(String[] args) {
		double s=10000 ;
		double hr,ta,da;
		ta=s*10 / 100;
		da=s*20 / 100;
		hr=s*30 / 100;
		
		s=s+ta+da+hr;
		System.out.println("total salary:"+s);
	}

	

}
