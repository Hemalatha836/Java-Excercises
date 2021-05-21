import java.util.Comparator;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public Student(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public static Comparator<Student> NameComparator=new Comparator<Student>(){
		public int compare(Student s1,Student s2) {
			String Name1=s1.getName().toUpperCase();
			String Name2=s2.getName().toUpperCase();
			
			return Name1.compareTo(Name2);
		}
	};
	public static Comparator<Student> Age=new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			int age1=s1.getAge();
			int age2=s2.getAge();
			
			return age1-age2;
		}
	};
	public static Comparator<Student> Id=new Comparator<Student>() {
		public int compare(Student s1,Student s2) {
			int id1=s1.getId();
			int id2=s2.getId();
			
			return id1-id2;
		}

	};
	@Override
	public String toString() {
		return "name:" + name + ",age=" + age + ",id=" + id +"";
		
	}

}
