import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOrder {

	private static List Order;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	 	Order o1 = new Order(1,"Car","Hema");
        Order o2 = new Order(2,"Train","Chinnu");
        Order o3 = new Order(3,"Bus","Madhu");
		 	

	        
	        try {
	            FileOutputStream fos = new FileOutputStream(new File("file.txt"));
	            ObjectOutputStream oos = new ObjectOutputStream(fos);

	            oos.writeObject(o1);
	            oos.writeObject(o2);
	            oos.writeObject(o3);
	            oos.flush();
	            oos.close();
	            fos.close();
	           // System.out.println("Success");
	           
	            //Read files
	            FileInputStream fis = new FileInputStream(new File("file.txt"));
	            ObjectInputStream ois = new ObjectInputStream(fis);

	            Order order1 = (Order) ois.readObject();
	            Order order2 = (Order) ois.readObject();
	            Order order3 = (Order) ois.readObject();

	            System.out.println("Values retrieved from file : " + order1.getOrderId() + " and " + order1.getProductName());
	            System.out.println("Values retrieved from file : " + order2.getOrderId() + " and " + order2.getProductName() );
	            System.out.println("Values retrieved from file : " + order3.getOrderId() + " and " +order3.getProductName() );
	            
	            //System.out.println(order1.toString());

	            ois.close();
	            fis.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found");
	        } catch (IOException e) {
	            System.out.println("Error initializing stream");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
