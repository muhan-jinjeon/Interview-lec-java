package college.association;

import java.util.List;

public class Dept {
	private List<Student> students;
	private String deptName;

	public Dept(List<Student> students, String deptName) {
		//super();
		this.students = students;
		this.deptName = deptName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept [students=" + students + ", deptName=" + deptName + "]";
	}

}
