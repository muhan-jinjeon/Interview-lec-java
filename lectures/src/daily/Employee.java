package daily;

public class Employee {
	

	   private int id;
	   private String name;
	   private String email;
	   private String address;
	   
	   public Employee(){  }
	   
	   public Employee(int id, String name){	    
		    this.id = id;	    
			this.name = name;		
			System.out.println("Two Parameter Constructor... ");
			this.display();
	   }   
	   public Employee(int id, String name, String email){   
			this(id, name);
			this.email = email; 
			//this(id, name); 
			System.out.println("Three Parameter Constructor... ");
			this.display();
			
	   }   
	   public Employee(int id, String name, String email, String address){   
			this(id, name, email);
			this.address = address;  
			System.out.println("Four Parameter Constructor... ");
			this.display();
			display();
	   } 
	   
	   public void display(){
			System.out.println("Id = "+id+"  Name = "+name+"  Email = "+email+"  Address = "+address);
	   }
	   
	   public static void main(String p[]){
		   
		   
	   }

	}