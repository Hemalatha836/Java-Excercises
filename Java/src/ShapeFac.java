import java.util.Scanner;

public class ShapeFac {
	

	public Shape getShape(String shapeType){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Shape Name:");
		String response=sc.nextLine();
		
		if(shapeType == null){
	         return null;
	      }		
	      if("Circle".equalsIgnoreCase(response)){
	         return new Circle();
	         
	      } else if("Rectangle".equalsIgnoreCase(response)){
	         return new Rectangle();
	         
	      } else if("Square".equalsIgnoreCase(response)){
	         return new Square(); 
	       }
	      
	      return null;
	   }

}
