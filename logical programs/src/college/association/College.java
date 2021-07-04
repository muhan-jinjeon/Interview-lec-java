package college.association;

import java.util.Set;

public class College {

	private Set<Dept> dept;
	private String collegeName;

	public College(Set<Dept> dept, String collegeName) {
		//super();
		this.dept = dept;
		this.collegeName = collegeName;
	}

	public Set<Dept> getDept() {
		return dept;
	}

	public void setDept(Set<Dept> dept) {
		this.dept = dept;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "College [dept=" + dept + ", collegeName=" + collegeName + "]";
	}

}
