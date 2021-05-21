
public final class Employee {
	private String firstname;
	private String lastname;
	private int age;
	private String company;
	private String experience;
	
	
	public Employee(String firstname,String lastname,int age,String company,String experience) {
		super();
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.company=company;
		this.experience=experience;
		
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	

}
