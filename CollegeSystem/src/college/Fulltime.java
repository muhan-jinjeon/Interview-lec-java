package college;

public class Fulltime extends Employee {
	
	private double ctc;

	public Fulltime(int id, Name name, Address address , double ctc) {
		super(id, name, address);
		this.ctc = ctc;
		
		
	}

	public double getctc() {
		return ctc;
	}

	public void setctc(double ctc) {
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return "PartTime [hours=" + ctc + "]";
	}
   
}

