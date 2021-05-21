import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Shape Name:");
		String response=sc.nextLine();
		
		if("circle".equals(response)) {
		Circle ci=new Circle();
		ci.print_circle();
		}
		
		else if("rectangle".equals(response)) {
			Rectangle re=new Rectangle();
			re.print_rect();
			}
		
		else if("square".equals(response)) {
			Square sq=new Square();
			sq.print_square();
			}



	}

}
