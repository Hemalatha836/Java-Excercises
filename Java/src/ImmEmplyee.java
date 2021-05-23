
public class ImmEmplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee emp1 = new Employee.EmployeeBuilder("Hema")
				    .age(25)
				    .build();
				 
		 System.out.println(emp1);
				 
		Employee emp2 = new Employee.EmployeeBuilder("Madhu")
				    .company("wipro")
				    .exp("2.3")
				    .build();
				 
		System.out.println(emp2);

	}

}
