package college;


public class Name {
	
	private String firstName;
	private String lastName;
	  
	public Name(String firstName , String lastName) {
		super();
		this.firstName= firstName ;
		this.firstName= firstName ;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}