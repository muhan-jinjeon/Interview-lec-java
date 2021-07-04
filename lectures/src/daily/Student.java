package daily;

public class Student {
	private int id;
	private String name;
	private String email;
	private String address;
	
	public Student() {
	}
		public Student(int id, String name) {
			this.id=id;
			this.name=name;
			System.out.println("Two parameter constructor");
			this.display();
		
		}
			public Student(int id, String name,String email) {
				this(id,name);
				this.email=email;
				System.out.println("three parameter constructor");
				this.display();
			}
			
	}

