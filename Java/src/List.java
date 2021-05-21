import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Ram", 24, 301));
		list.add(new Student("Abay", 21, 101));
		list.add(new Student("Zara", 28, 501));
		list.add(new Student("Ken", 25, 300));
		/*Sorting based on name*/
		System.out.println("Name Sorting:");
		Collections.sort(list, Student.NameComparator);
		
		for(Student str:list) {
			System.out.println(str);
		}
		
		
		/*Sorting based on age*/
		System.out.println("Age Sorting:");
		Collections.sort(list, Student.Age);
		
		for(Student str:list) {
			System.out.println(str);
		}
		
		/*Sorting based on id*/
		System.out.println("Id Sorting:");
		Collections.sort(list, Student.Id);
		
		for(Student str:list) {
			System.out.println(str);
		}
		
		
		
	}

	

}
