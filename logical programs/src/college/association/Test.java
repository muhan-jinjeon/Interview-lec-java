package college.association;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String args[]) {
		Name n1 = new Name("Aron", "Dzouza");
		Address a1 = new Address("India", "MH", "mumbai", "400421");
		Student s1 = new Student(101, n1, a1);

		Name n2 = new Name("Arun", "Dubey");
		Address a2 = new Address("India", "MH", "pune", "400422");
		
		Student s2 = new Student(102, n2, a2);

		Name n3 = new Name("Ali", "khan");
		Address a3 = new Address("India", "MH", "nagpur", "400423");
		Student s3 = new Student(103, n3, a3);

		Name n4 = new Name("Subodh", "Thakre");
		Address a4 = new Address("India", "MH", "solapur", "400424");
		Student s4 = new Student(104, n4, a4);

		List<Student> chemistryStudents = new ArrayList<>();
		chemistryStudents.add(s1);
		chemistryStudents.add(s2);
		Dept d1 = new Dept(chemistryStudents, "Chemistry");

		List<Student> physicsStudents = new ArrayList<>();
		physicsStudents.add(s3);
		physicsStudents.add(s4);
		physicsStudents.add(s1);
		Dept d2 = new Dept(physicsStudents, "Physics");

		Set<Dept> dept = new HashSet<>();
		dept.add(d1);
		dept.add(d2);

		College c = new College(dept, "St.Thomas");

		System.out.println(c);
		Set<Dept> departments = c.getDept();
		for (Dept dt : departments) {
			List<Student> s = dt.getStudents();
			
			for(Student st: s) {
				
				if(dt.getDeptName().equals("Chemistry"))
				{
					System.out.println(st);	
				}
				
			}

		}
	}

}
