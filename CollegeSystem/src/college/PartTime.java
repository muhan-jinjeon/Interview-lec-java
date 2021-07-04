package college;

public class PartTime extends Employee {
	
	private double hours;

	public PartTime(int id, Name name, Address address , double hours) {
		super(id, name, address);
		this.hours = hours;
		
		
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "PartTime [hours=" + hours + "]";
	}
   
}
